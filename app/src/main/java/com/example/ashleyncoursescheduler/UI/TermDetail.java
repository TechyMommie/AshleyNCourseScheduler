package com.example.ashleyncoursescheduler.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ashleyncoursescheduler.R;

public class TermDetail extends AppCompatActivity {
    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_view);
        RecyclerView recyclerView = findViewById(R.id.termRecView);
    }
}
