package com.example.secondweekassignment.api;

import com.example.secondweekassignment.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeInterface {

    //annotation
    @GET("employees")
    //call le request and response tanne kam garcha.
    Call<List<Employee>> getEmps();

    
}
