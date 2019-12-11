package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.secondweekassignment.api.EmployeeInterface;
import com.example.secondweekassignment.model.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitEmpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_emp);

        //retrofit ko object banako
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dummy.restapiexample.com/api/v1/").addConverterFactory(GsonConverterFactory.create()).build();

        //interface ko object banako through retrofit
        EmployeeInterface empInter = retrofit.create(EmployeeInterface.class);


        Call<List<Employee>> employeeList = empInter.getEmps();

        //enqueue is used for extract call type object
        employeeList.enqueue(new Callback<List<Employee>>() {
            @Override
            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
                List<Employee> empList = response.body();
                for (Employee emp : empList) {
                    Log.d("name", emp.getEmployee_name());
//                    Log.d("salary", String.valueOf(emp.getEmployee_salary()));
//                    Log.d("name", String.valueOf(emp.getEmployee_age()));
                }
            }

            @Override
            public void onFailure(Call<List<Employee>> call, Throwable t) {
                Log.d("ApiEx", t.getMessage());

            }
        });
    }
}
