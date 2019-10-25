package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;


public class TableLayoutActivity extends AppCompatActivity
        implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    EditText editTextN,editTextD,editTextP,editTextE;
    RadioGroup radioGroup;
    Spinner spinner;
    Button btnSubmit;
    String name,gender,dob,phone,email,country;
    String[] countries = {"Please Select Country","Nepal", "India", "Sri Lanka", "Bhutan", "Pakistan","Afghanistan","Maldives"};

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

        radioGroup.setOnCheckedChangeListener(this);

        //adapter arko layout ko value tanne
        //array values are set to another layout.
        //recyclerview adapter is used for images.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.spinner_values,countries);
        spinner.setAdapter(adapter);
        setSpinnerValue();
        btnSubmit.setOnClickListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == R.id.rbMale){
            //Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            gender ="Male";
        }
        if (i == R.id.rbFemale){
            gender ="Female";
        }
        if (i == R.id.rbOther){
            gender ="Other";
        }
    }

    private void setSpinnerValue(){
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               country = adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(TableLayoutActivity.this, "Please Select Country", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View view) {

        name = editTextN.getText().toString();
        dob = editTextD.getText().toString();
        email= editTextE.getText().toString();
        phone = editTextP.getText().toString();

        if(view.getId()==R.id.btnSubmit){
            if(validate()){
                Toast.makeText(this, "All Ok", Toast.LENGTH_SHORT).show();
            }
        }

    }
    private boolean validate(){
        if(TextUtils.isEmpty(name)){
            editTextN.setError("Enter Name");
            editTextN.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(gender)){
            Toast.makeText(this, "Please select gender", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(TextUtils.isEmpty(country)){
            Toast.makeText(this, "Please select country", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(TextUtils.isEmpty(dob)){
            editTextD.setError("Enter dob");
            editTextD.requestFocus();
            return false;
        }
        if(TextUtils.isEmpty(email)){
            editTextE.setError("Enter Email");
            editTextE.requestFocus();
            return false;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextE.setError("Invalid Email");
            editTextE.requestFocus();
            return false;

        }
        if(TextUtils.isEmpty(phone)){
            editTextP.setError("Enter Phone");
            editTextP.requestFocus();
            return false;
        }
        if(!TextUtils.isDigitsOnly(phone)){
            editTextP.setError("Invalid Number");
            editTextP.requestFocus();
            return false;
        }

        return true;
    }
}
