package com.example.ashleyncoursescheduler.Entities;

import androidx.room.PrimaryKey;
import androidx.room.Entity;

import java.util.Date;

@Entity(tableName = "assessments")
public class Assessments {
    @PrimaryKey(autoGenerate = true)
    private int AssessmentId;
    private String Title;
    private String AssessmentStart;
    private String AssessmentEnd;
    private String AssessmentType;
    //ASN: May need to add Courses as an association.
    public Assessments() {
    }

    public Assessments(int assessmentId, String title, String assessmentStart, String assessmentEnd, String assessmentType) {
        AssessmentId = assessmentId;
        Title = title;
        AssessmentStart = assessmentStart;
        AssessmentEnd = assessmentEnd;
        AssessmentType = assessmentType;
    }

    public int getAssessmentId() {
        return AssessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        AssessmentId = assessmentId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAssessmentStart() {
        return AssessmentStart;
    }

    public void setAssessmentStart(String assessmentStart) {
        AssessmentStart = assessmentStart;
    }

    public String getAssessmentEnd() {
        return AssessmentEnd;
    }

    public void setAssessmentEnd(String assessmentEnd) {
        AssessmentEnd = assessmentEnd;
    }

    public String getAssessmentType() {
        return AssessmentType;
    }

    public void setAssessmentType(String assessmentType) {
        AssessmentType = assessmentType;
    }
}

