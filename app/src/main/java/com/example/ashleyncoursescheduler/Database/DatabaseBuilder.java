package com.example.ashleyncoursescheduler.Database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.example.ashleyncoursescheduler.DAO.AssessmentDAO;
import com.example.ashleyncoursescheduler.DAO.CourseDAO;
import com.example.ashleyncoursescheduler.DAO.TermDAO;
import com.example.ashleyncoursescheduler.Entities.Assessments;
import com.example.ashleyncoursescheduler.Entities.Courses;
import com.example.ashleyncoursescheduler.Entities.Terms;

@Database(entities = {Courses.class, Terms.class, Assessments.class}, version=1, exportSchema = false)
public abstract class DatabaseBuilder extends RoomDatabase {
    public abstract CourseDAO CourseDAO();
    public abstract TermDAO TermDAO();
    public abstract AssessmentDAO AssessmentDAO();

    private static volatile DatabaseBuilder INSTANCE;

    static DatabaseBuilder getDatabase(final Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), DatabaseBuilder.class, "Course Scheduler Database")
                    .fallbackToDestructiveMigration().build();
        }
        return INSTANCE;
    }
}

