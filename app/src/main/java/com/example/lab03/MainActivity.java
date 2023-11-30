package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtFar, txtCel;
    Button btnFAr,btnCel, BtnClear ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFar = findViewById(R.id.txtFar);
        txtCel = findViewById(R.id.txtCel);
        btnCel = findViewById(R.id.btnCel);
        btnFAr = findViewById(R.id.btnFAr);
       BtnClear = findViewById(R.id.BtnClear);
       btnCel.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               int C = Integer.parseInt(txtCel.getText().toString());
               Double F = C*1.8 + 32;
               txtCel.setText(F+"");
           }
       });
        btnFAr.setOnClickListener(new View.OnClickListener(){
            @Override   
            public void onClick(View view){
                int F = Integer.parseInt(txtFar.getText().toString());
                Double C = (F-32)/1.8;
                txtFar.setText(C+"");
            }
        });
        BtnClear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                txtFar.setText("");
                txtCel.setText("");
            };
        });


    }
}