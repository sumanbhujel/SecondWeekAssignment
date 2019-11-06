package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.secondweekassignment.adapter.MyRvFoodAdapter;
import com.example.secondweekassignment.model.Food;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List <Food> foods = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        recyclerView = findViewById(R.id.rvFoods);

        foods.add(new Food( "Mo:Mo", "Chicken","Rs.150",R.drawable.momo));
        foods.add(new Food( "Chowmein", "Buff","Rs.140",R.drawable.chowmein));
        foods.add(new Food( "Fried Rice", "Chicken","Rs.160",R.drawable.friedrice));


        MyRvFoodAdapter adapter = new MyRvFoodAdapter(foods);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
