package com.example.ashleyncoursescheduler.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ashleyncoursescheduler.Database.Repository;
import com.example.ashleyncoursescheduler.Entities.Terms;
import com.example.ashleyncoursescheduler.R;

public class HomePage extends AppCompatActivity {
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager();
        setContentView(R.layout.activity_homepage);

        ImageButton termView = findViewById(R.id.btnTermView);
        ImageButton courseView = findViewById(R.id.btnCourseView);
        ImageButton assessView = findViewById(R.id.btnAssessmentView);

        //Term View Click
        termView.setOnClickListener(view -> {
            TermAdapter termAdapter = new TermAdapter(this );

            TermList termListFragment  = new TermList();
            setContentView(R.layout.term_list_item);
            RecyclerView recView = findViewById(R.id.termRecyclerView);
            recView.setAdapter(termAdapter);
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.frameLayoutTermView, termListFragment).commit();
        });

        //Course View Click
        courseView.setOnClickListener(view -> {
            CourseAdapter courseAdapter = new CourseAdapter(this);

            CourseList courseListFragment  = new CourseList();
            setContentView(R.layout.fragment_course_view);
            //RecyclerView recView = findViewById(R.id.courseRecyclerView);
            //recView.SetAapter(courseAdapter);
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.cLCourseView, courseListFragment).commit();
        });

        //Assessment View Click
        assessView.setOnClickListener(view -> {
            AssessmentList assessmentListFragment  = new AssessmentList();
            setContentView(R.layout.fragment_assessment_list_item);
//            RecyclerView recView = findViewById(R.id.assessmentRecyclerView);
//            recView.SetAapter(AssessmentAdapter);
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.clayoutAssessment, assessmentListFragment).commit();
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.menuItemTerms:
                //Repository repo = new Repository(getApplication());
                //Terms terms = new Terms();
                return true;
            case R.id.menuItemCourses:
                return true;
            case R.id.btnAssessmentView:
        }
       return true;
    }

}
