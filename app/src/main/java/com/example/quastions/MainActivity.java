package com.example.quastions;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
RadioGroup radioGroup;
RadioButton radioButton;
RadioButton r1;
RadioButton r2;
RadioButton r3;
int r=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.groube);
        r1=findViewById(R.id.radio_pirates);
        r2=findViewById(R.id.radio_ninjas);


        b = findViewById(R.id.button);
     /*   b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this,Quize.class);
                startActivity(n);
            }
        });*/
          b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    r++;
                    Handler handler=new Handler();
                    handler.postDelayed(new Runnable() {
                        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                        @Override
                        public void run() {
                            if(r==1){
                                b.setText("next");
                                int selectedId = radioGroup.getCheckedRadioButtonId();
                                radioButton = (RadioButton) findViewById(selectedId);
                            if(radioButton.getText().equals("الايمن")){
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                r1.setEnabled(false);
                                r2.setEnabled(false);

                            }


                            }else if(r==2){
                                Toast.makeText(getApplicationContext(), "xikmxa", Toast.LENGTH_SHORT).show();
                                b.setText("cssckmxmxwaxawxaws");

                            }else if(r==3){
                                Toast.makeText(getApplicationContext(), "xikmxa", Toast.LENGTH_SHORT).show();
                                b.setText("cemiecji");
                        }}
                    },500);


                }

            });
        }}

       // TextView t=findViewById(R.id.textView);
       // String f=getResources().getString(R.string.app_name);
       // t.setText(f+"");


