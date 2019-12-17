package com.example.secondweekassignment.api;

import com.example.secondweekassignment.model.Flag;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FlagInterface {

    @GET("flags")
    Call<List<Flag>> getFlags();

    @GET("singleflag/{id}")
    Call<Flag> getCountryById(@Path("id") int id);
}
