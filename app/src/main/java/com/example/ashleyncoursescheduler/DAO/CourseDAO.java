package com.example.ashleyncoursescheduler.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.ashleyncoursescheduler.Entities.Courses;

import java.util.List;

@Dao
public interface CourseDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Courses course);
    @Update
    void update(Courses course);
    @Delete
    void delete(Courses course);
    @Query("SELECT * FROM COURSES ORDER BY CourseId ASC")
    List<Courses> getAllCourses();
}
