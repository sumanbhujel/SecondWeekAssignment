package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class TableLayoutActivity extends AppCompatActivity {
    EditText editTextN,editTextD,editTextP,editTextE;
    RadioGroup radioGroup;
    Spinner spinner;
    Button btnSubmit;
    String name,gender,dob,phone,email,country;
    String[] countries = {"Nepal", "India", "Sri Lanka", "Bhutan", "Pakistan","Afghanistan","Maldives"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        editTextN = findViewById(R.id.etName);
        editTextD = findViewById(R.id.etDate);
        editTextE = findViewById(R.id.etEmail);
        editTextP = findViewById(R.id.etPhone);
        radioGroup = findViewById(R.id.rgGender);
        spinner  = findViewById(R.id.spCountry);
        btnSubmit = findViewById(R.id.btnSubmit);

        //adapter arko layout ko value tanne
        //array values are set to another layout.
        //recyclerview adapter is used for images.
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.spinner_values,countries);
        spinner.setAdapter(adapter);

    }
}
