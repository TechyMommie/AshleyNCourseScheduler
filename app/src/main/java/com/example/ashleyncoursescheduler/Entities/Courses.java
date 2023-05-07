package com.example.ashleyncoursescheduler.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDate;
import java.util.Date;

@Entity(tableName="courses")
public class Courses {
    @PrimaryKey(autoGenerate = true)
    private int CourseId;
    private String CourseName;
    private String InstructorName;
    private String AssessmentType;
    private String StartDate;
    private String EndDate;
    private Boolean Status;

    public Courses(){

    }

    public Courses(int courseId, String courseName, String instructorName, String assessmentType, String startDate, String endDate, Boolean status) {
        CourseId = courseId;
        CourseName = courseName;
        InstructorName = instructorName;
        AssessmentType = assessmentType;
        StartDate = startDate;
        EndDate = endDate;
        Status = status;
    }
    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }
    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getInstructorName() {
        return InstructorName;
    }

    public void setInstructorName(String instructorName) {
        InstructorName = instructorName;
    }

    public String getAssessmentType() {
        return AssessmentType;
    }

    public void setAssessmentType(String assessmentType) {
        AssessmentType = assessmentType;
    }




}

