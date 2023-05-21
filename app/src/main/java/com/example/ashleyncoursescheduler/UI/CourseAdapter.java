package com.example.ashleyncoursescheduler.UI;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ashleyncoursescheduler.Entities.Courses;
import com.example.ashleyncoursescheduler.Entities.Terms;
import com.example.ashleyncoursescheduler.R;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    class CourseViewHolder extends RecyclerView.ViewHolder {
        private final TextView courseItemView;

        //Constructor
        private CourseViewHolder(View itemView){
            super(itemView);
            courseItemView = itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    final Courses current = mCourses.get(position);
                    Intent intent = new Intent(context, Courses.class);
                    intent.putExtra("id", current.getCourseId());
                    intent.putExtra("title", current.getCourseName());
                    intent.putExtra("start", current.getStartDate());
                    intent.putExtra("end",current.getEndDate());
                    intent.putExtra("instructor", current.getInstructorName());
                    intent.putExtra("status", current.getStatus());
                }
            });
        }
    }

    private List<Courses> mCourses;
    private final Context context;
    private final LayoutInflater mInflater;

    public CourseAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
    }
        @NonNull
        @Override
        public CourseAdapter.CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = mInflater.inflate(R.layout.fragment_course_view ,parent, false);
            return new CourseViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull CourseAdapter.CourseViewHolder holder, int position) {
            if(mCourses != null){
                Courses current = mCourses.get(position);
                String title = current.getCourseName();
                holder.courseItemView.setText(title);
            }
            else
                holder.courseItemView.setText("No course title available.");
        }
        public void setCourse(List<Courses> courses){
        mCourses = courses;
        notifyDataSetChanged();
        }
        @Override
        public int getItemCount() {
        if(mCourses != null){
            return mCourses.size();
        }
        else
            return 0;
        }

}
