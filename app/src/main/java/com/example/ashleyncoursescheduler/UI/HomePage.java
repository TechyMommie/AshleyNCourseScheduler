package com.example.ashleyncoursescheduler.UI;

import static android.text.TextUtils.replace;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.ashleyncoursescheduler.R;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        ImageButton termView = findViewById(R.id.btnTermView);
        ImageButton courseView = findViewById(R.id.btnCourseView);
        ImageButton assessView = findViewById(R.id.btnAssessmentView);
//        supportFragmentManager().beginTransaction().apply {
//            replace(R.id.frameLayoutTermView, termView)
//        }
        termView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivityFromFragment(new Fragment());
            }
        });
        courseView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivityFromFragment(new Fragment());
            }
        });
        assessView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivityFromFragment(new Fragment());
            }
        });
        }

}
