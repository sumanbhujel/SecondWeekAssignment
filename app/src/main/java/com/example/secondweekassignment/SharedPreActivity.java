package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class SharedPreActivity extends AppCompatActivity {

    SharedPreferences sp;
    SharedPreferences.Editor editor; //write garna editor ko object

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pre);

        //getcontext for current activity  and variable is saved in mysp
        sp = getApplicationContext().getSharedPreferences("mysp", MODE_PRIVATE);
        editor = sp.edit();
        editor.putString("name", "Suman");
        editor.putInt("age", 30);
        editor.putLong("phone",982317160);
        editor.putBoolean("isMember", true);
        editor.commit(); //commit garnu parcha
    }
}
