package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class LayoutsActivity extends AppCompatActivity implements View.OnClickListener {

    //object
    Button buttonLl, buttonGl, buttonRl, buttonCl, buttonTl,buttonFl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);

        //referencing
        buttonLl = findViewById(R.id.btnLl);
        buttonGl = findViewById(R.id.btnGl);
        buttonRl = findViewById(R.id.btnRl);
        buttonCl = findViewById(R.id.btnCl);
        buttonTl = findViewById(R.id.btnTl);
        buttonFl = findViewById(R.id.btnFl);

        buttonFl.setOnClickListener(this);
        buttonTl.setOnClickListener(this);
        buttonCl.setOnClickListener(this);
        buttonRl.setOnClickListener(this);
        buttonGl.setOnClickListener(this);
        buttonLl.setOnClickListener(this);

    }

    //interface is used so override should be done
    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnFl){
            Intent intent = new Intent(this,FrameLayoutActivity.class);
            startActivity(intent);

        }
        if(view.getId() == R.id.btnTl){
            Intent intent = new Intent(this, TableLayoutActivity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.btnCl){
            Intent intent = new Intent(this, TaskOneActivity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.btnGl){
            Intent intent = new Intent(this, TaskFourActivity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.btnLl){
            Intent intent = new Intent(this, TaskTwoActivity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.btnRl){
            Intent intent = new Intent(this, RelativeActivity.class);
            startActivity(intent);
        }




    }
}
