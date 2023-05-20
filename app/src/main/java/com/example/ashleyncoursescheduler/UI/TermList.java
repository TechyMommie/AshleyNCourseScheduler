package com.example.ashleyncoursescheduler.UI;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ashleyncoursescheduler.R;

public class TermList extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}

