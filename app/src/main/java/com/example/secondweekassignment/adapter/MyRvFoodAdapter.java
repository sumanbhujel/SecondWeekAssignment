package com.example.secondweekassignment.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.secondweekassignment.R;
import com.example.secondweekassignment.model.Food;

import java.util.ArrayList;
import java.util.List;

public class MyRvFoodAdapter extends RecyclerView.Adapter<MyRvFoodAdapter.MyHolder> {

    List<Food> foodList = new ArrayList<>();

    public MyRvFoodAdapter(List<Food> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //layout bind garne...inflater le
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_food_rv, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        //data bind garne after view is created
        Food food = foodList.get(position);

        holder.imageView.setImageResource(food.getImg());
        holder.tvName.setText(food.getName());
        holder.tvCategory.setText(food.getCategory());
        holder.tvRate.setText(food.getRate());

    }

    @Override
    public int getItemCount() {

        //kati ota item cha vanera length dine
        return foodList.size();
    }

    //resource file ko reference lina.....view hold garcha
    //inner class= myholder
    public class MyHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName, tvCategory, tvRate;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.foodImage);
            tvName = itemView.findViewById(R.id.foodName);
            tvCategory = itemView.findViewById(R.id.foodCategory);
            tvRate = itemView.findViewById(R.id.foodRate);
        }
    }
}
