package com.example.ashleyncoursescheduler.UI;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ashleyncoursescheduler.Entities.Assessments;
import com.example.ashleyncoursescheduler.R;

import java.util.List;

public class AssessmentAdapter extends RecyclerView.Adapter<AssessmentAdapter.AssessmentViewHolder>{
    class AssessmentViewHolder extends RecyclerView.ViewHolder{
        private final TextView assessmentItemView;
        //Constructor
        private AssessmentViewHolder(View itemView){
            super(itemView);
            assessmentItemView = itemView.findViewById(R.id.txtTerms);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    final Assessments current = mAssessments.get(position);
                    Intent intent = new Intent(context, Assessments.class);
                    intent.putExtra("id", current.getAssessmentId());
                    intent.putExtra("title", current.getTitle());
                    intent.putExtra("Start", current.getAssessmentStart());
                    intent.putExtra("End",current.getAssessmentEnd());
                    intent.putExtra("type", current.getAssessmentType());
                }
            });
        }
    }
    private List<Assessments> mAssessments;
    private final Context context;
    private final LayoutInflater mInflater;

    public AssessmentAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
    }
    @NonNull
    @Override
    public AssessmentAdapter.AssessmentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.fragment_assessment_view, parent, false);
        return new AssessmentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AssessmentAdapter.AssessmentViewHolder holder, int position) {
        if(mAssessments != null) {
            Assessments current = mAssessments.get(position);
            String title = current.getTitle();
            holder.assessmentItemView.setText(title);
        }
        else
            holder.assessmentItemView.setText("No assessment title available.");
    }

    public void setAssessments(List<Assessments> assessments){
        mAssessments = assessments;
        notifyDataSetChanged();
    }
    @Override
    public int getItemCount() {
        if(mAssessments != null){
            return mAssessments.size();
        }
        else
            return 0;
    }
}
