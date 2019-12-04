package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.secondweekassignment.database.DbHelper;

public class DatabaseActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        DbHelper dbHelper = new DbHelper(this);
        dbHelper.addStudent();





    }
}
