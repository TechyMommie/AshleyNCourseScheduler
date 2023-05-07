package com.example.ashleyncoursescheduler.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.ashleyncoursescheduler.Entities.Assessments;

import java.util.List;

@Dao
public interface AssessmentDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Assessments assessments);
    @Update
    void update(Assessments assessments);
    @Delete
    void delete(Assessments assessments);
    @Query("SELECT * FROM ASSESSMENTS ORDER BY AssessmentId ASC")
    List<Assessments> getAllAssessment();
}
