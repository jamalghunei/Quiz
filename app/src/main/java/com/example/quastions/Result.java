package com.example.quastions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result=findViewById(R.id.Resulte);
        Intent intent = getIntent();
        int resulte=intent.getIntExtra("result",0);
        result.setText(resulte+"");

    }
}
