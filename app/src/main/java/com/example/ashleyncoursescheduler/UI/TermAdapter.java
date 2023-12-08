package com.example.ashleyncoursescheduler.UI;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ashleyncoursescheduler.Entities.Terms;
import com.example.ashleyncoursescheduler.R;

import java.util.List;

public class TermAdapter extends RecyclerView.Adapter<TermAdapter.TermViewHolder> {
    class TermViewHolder extends RecyclerView.ViewHolder{
        private final TextView termItemView;
        //Constructor
        private TermViewHolder(View itemView){
            super(itemView);
            termItemView = itemView.findViewById(R.id.txtTerms);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    final Terms current = mTerms.get(position);
                    Intent intent = new Intent(context, Terms.class);
                    intent.putExtra("id", current.getTermId());
                    intent.putExtra("title", current.getTitle());
                    intent.putExtra("Start", current.getTermStart());
                    intent.putExtra("End",current.getTermEnd());
                }
            });
        }
    }

    private List<Terms> mTerms;
    private final Context context;
    private final LayoutInflater mInflater;

    public TermAdapter(Context context) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @NonNull
    @Override
    public TermAdapter.TermViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.fragment_term_view,parent, false);
        return new TermViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TermAdapter.TermViewHolder holder, int position) {
        if(mTerms != null){
            Terms current = mTerms.get(position);
            String title = current.getTitle();
            holder.termItemView.setText(title);
        }
        else
            holder.termItemView.setText("No term title available.");
    }
    public void setTerms(List<Terms> terms){
        mTerms = terms;
        notifyDataSetChanged ();
    }

    @Override
    public int getItemCount() {
        if(mTerms != null){
            return mTerms.size();
        }
        else
            return 0;
    }

}
