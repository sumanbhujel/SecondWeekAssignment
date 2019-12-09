package com.example.secondweekassignment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.secondweekassignment.adapter.StudentAdapter;
import com.example.secondweekassignment.database.DbHelper;
import com.example.secondweekassignment.model.Student;

import java.util.List;

public class ShowStudentActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_student);

        dbHelper = new DbHelper(this);


        List<Student> students = dbHelper.getStudents();

        StudentAdapter studentAdapter = new StudentAdapter(students);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(studentAdapter);


    }
}
