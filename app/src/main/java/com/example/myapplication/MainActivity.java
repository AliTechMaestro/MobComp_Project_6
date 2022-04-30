package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textResult;
        EditText input;
        Button btn;

        input = findViewById(R.id.input);
        textResult = findViewById(R.id.result);
        btn = findViewById(R.id.btn);

        input.setShowSoftInputOnFocus(false);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = input.getText().toString();

                int decNum = Integer.parseInt(val);

                String binary = Integer.toBinaryString(decNum);

                textResult.setText(binary);



            }
        });






    }



}