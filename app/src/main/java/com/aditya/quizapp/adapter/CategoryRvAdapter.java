package com.aditya.quizapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.aditya.quizapp.model.CategoryRvModel;
import com.aditya.quizapp.R;

import java.util.ArrayList;

public class CategoryRvAdapter extends RecyclerView.Adapter<CategoryRvAdapter.ViewHolder> {
    Context context;
    ArrayList<CategoryRvModel> rvModelList;
    public CategoryRvAdapter(Context context , ArrayList<CategoryRvModel> rvModelList) {
            this.context = context;
            this.rvModelList = rvModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.category_quiz_card_rv_lay,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.catTitleTV.setText(rvModelList.get(position).getCategoryTitle());
        holder.categoryIv.setImageResource(rvModelList.get(position).getImgId());
        holder.totalQuestionTV.setText(rvModelList.get(position).getTotalQuestion() + " Questions");

    }

    @Override
    public int getItemCount() {
        return rvModelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView catTitleTV, totalQuestionTV;
        ImageView categoryIv;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            catTitleTV = itemView.findViewById(R.id.category_recycler_view_item_tv);
            totalQuestionTV = itemView.findViewById(R.id.category_rv_question_no_item_tv);
            categoryIv = itemView.findViewById(R.id.img_rv_item);




        }
    }
}
