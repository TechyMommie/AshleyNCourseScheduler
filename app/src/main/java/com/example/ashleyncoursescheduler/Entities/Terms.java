package com.example.ashleyncoursescheduler.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDate;
import java.util.Date;

@Entity(tableName = "Terms")
public class Terms {
    @PrimaryKey(autoGenerate = true)
    private int TermId;
    private String Title;
    private String TermStart;
    private String TermEnd;

    public Terms() {
    }

    public Terms(int termId, String title, String termStart, String termEnd) {
        TermId = termId;
        Title = title;
        TermStart = termStart;
        TermEnd = termEnd;
    }

    public int getTermId() {
        return TermId;
    }

    public void setTermId(int termId) {
        TermId = termId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTermStart() {
        return TermStart;
    }

    public void setTermStart(String termStart) {
        TermStart = termStart;
    }

    public String getTermEnd() {
        return TermEnd;
    }

    public void setTermEnd(String termEnd) {
        TermEnd = termEnd;
    }
}

