package com.myfirst.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mtok= (Button) findViewById(R.id.button);
        mtok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxmiles= (EditText) findViewById(R.id.editTextTextPersonName);
                EditText textboxkm=(EditText) findViewById(R.id.editTextTextPersonName2);
                double vMiles= Double.valueOf(textboxmiles.getText().toString());
                double vkm= vMiles/0.62137;
                DecimalFormat formatVal=new DecimalFormat("##.##");
                textboxkm.setText(formatVal.format(vkm));

            }


        });
        Button kmtom=(Button) findViewById(R.id.button2);
        kmtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxkm=(EditText) findViewById(R.id.editTextTextPersonName2);
                EditText textboxmiles=(EditText) findViewById(R.id.editTextTextPersonName);
                double vkm=Double.valueOf(textboxkm.getText().toString());
                double vMiles=vkm*0.62137;
                DecimalFormat formatVal= new DecimalFormat("##.##");
                textboxmiles.setText(formatVal.format(vMiles));
            }
        });

    }
}