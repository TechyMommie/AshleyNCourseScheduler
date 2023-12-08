package com.example.ashleyncoursescheduler.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ashleyncoursescheduler.Database.Repository;
import com.example.ashleyncoursescheduler.Entities.Assessments;
import com.example.ashleyncoursescheduler.Entities.Courses;
import com.example.ashleyncoursescheduler.Entities.Terms;
import com.example.ashleyncoursescheduler.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.btnLetsGo);
        Terms terms = new Terms(0,"SpringTerm","05/04/2025","06/30/2025");
        Courses courses = new Courses(1,"English II","John Wick","Project","11/26/2023","01/01/2024",true);
        Assessments assessments = new Assessments(1,"English II Project","11/29/2023","11/29/2023","Project");
        Repository repository = new Repository(getApplication());
        try {
            repository.Insert(terms);
            repository.Insert(assessments);
            repository.Insert(courses);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        button.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, HomePage.class)));

    }
}