package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.secondweekassignment.api.EmployeeInterface;
import com.example.secondweekassignment.api.FlagInterface;
import com.example.secondweekassignment.model.Flag;
import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FlagAppActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Retrofit retrofit;
    FlagInterface flagInter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_app);

        imageView = findViewById(R.id.imageFlag);
        textView = findViewById(R.id.nameCountry);
        getInstance();
        getCountryById(4);
    }

    private void getInstance() {

        retrofit = new Retrofit.Builder()
                .baseUrl("http://sujitg.com.np/api/").addConverterFactory(GsonConverterFactory.create()).build();
        flagInter = retrofit.create(FlagInterface.class);
    }

    private void getCountryById(int id) {

        Call<Flag> flagCall = flagInter.getCountryById(id);

        flagCall.enqueue(new Callback<Flag>() {
            @Override
            public void onResponse(Call<Flag> call, Response<Flag> response) {
                textView.setText(response.body().getCountry());
                Picasso.with(FlagAppActivity.this)
                        .load("http://sujitg.com.np/wc/teams/" + response.body().getFile()).into(imageView);
            }

            @Override
            public void onFailure(Call<Flag> call, Throwable t) {
                Log.d("Ex", t.getMessage());

            }
        });
    }
}
