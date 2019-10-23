package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class RegdataActivity extends AppCompatActivity {

    EditText editText;
    RadioGroup rgG;
    RadioButton rbM, rbF, rbO;
    Spinner spinner;
    CheckBox cbM, cbD, cbO;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regdata);

        editText = findViewById(R.id.editText);
        rgG = findViewById(R.id.radioGroup);
        rbM = findViewById(R.id.btnMale);
        rbF = findViewById(R.id.btnFemale);
        rbO = findViewById(R.id.btnOthers);
        spinner = findViewById(R.id.spinner1);
        cbM = findViewById(R.id.chkBox);
        cbD = findViewById(R.id.chkBox2);
        cbO = findViewById(R.id.chkBox3);
        button = findViewById(R.id.btnSubmit);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(RegdataActivity.this, adapterView.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(RegdataActivity.this, "Select One", Toast.LENGTH_SHORT).show();
            }
        });

        cbM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(RegdataActivity.this, "music checked", Toast.LENGTH_SHORT).show();
                    //hob[0]=cbM.getText().toString();

                } else {
                    //hob[0] = "";
                    Toast.makeText(RegdataActivity.this, "music uncheked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cbD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(RegdataActivity.this, "dance checked", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(RegdataActivity.this, "dance uncheked", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cbO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(RegdataActivity.this, "Others checked", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(RegdataActivity.this, "others uncheked", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, pradesh, hob;
                name = editText.getText().toString();
                pradesh = editText.getText().toString();
                hob = editText.getText().toString();
                Intent intent = new Intent(RegdataActivity.this, RegisterActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("pradesh", pradesh);
                intent.putExtra("hob", hob);
                startActivity(intent);
            }
        });
    }

}
