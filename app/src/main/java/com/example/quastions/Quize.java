package com.example.quastions;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
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

public class Quize extends AppCompatActivity {
Button confirm;
int r=0;
    RadioGroup radioGroup;
    RadioButton radioButton;
    RadioButton r1;
    RadioButton r2;
    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    int ff=0;
    TextView number;
    TextView quastion;
    int result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize);
        confirm=findViewById(R.id.button2);
        number=findViewById(R.id.number);
        quastion=findViewById(R.id.quastion);
        radioGroup = (RadioGroup) findViewById(R.id.groube);
        answer1=findViewById(R.id.radio_answer1);
        answer2=findViewById(R.id.radio_answer2);
        answer3=findViewById(R.id.radio_answer3);

     /*   b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this,Quize.class);
                startActivity(n);
            }
        });*/
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r++;
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    public void run() {
                        if (r == 1) {
                            String f=getResources().getString(R.string.next_btn);
                            confirm.setText(f+"");
                            int selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = (RadioButton) findViewById(selectedId);
                            if (radioButton==null) {

                            }else

                            if (radioButton.getText() != null && radioButton.getText().equals("اندرويد") || radioButton.getText().equals("Android")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);

                            } else if (radioButton!= null && !radioButton.getText().equals("اندرويد") || !radioButton.getText().equals("Android")) {
                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);

                            }

                        }else if(r==2){
                           radioGroup.clearCheck();
                            answer1.setEnabled(true);
                            answer2.setEnabled(true);
                            answer3.setEnabled(true);
                            if(radioButton!=null){
                            radioButton.setBackground(null);}
                            String number2=getResources().getString(R.string.number_Quastion2);
                            number.setText(number2+"");
                            String quastion2=getResources().getString(R.string.name_qustion2);
                            quastion.setText(quastion2+"");
                            String answer21=getResources().getString(R.string.app_answer21);
                            answer1.setText(answer21+"");
                            String answer22=getResources().getString(R.string.app_answer22);
                            answer2.setText(answer22+"");
                            String answer23=getResources().getString(R.string.app_answer23);
                            answer3.setText(answer23+"");
                            String f=getResources().getString(R.string.app_cheak);
                            confirm.setText(f+"");

                        }else if(r==3){
                            String f=getResources().getString(R.string.next_btn);
                            confirm.setText(f+"");
                            int selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = (RadioButton) findViewById(selectedId);
                            if (radioButton==null) {

                            }else

                            if (radioButton.getText() != null && radioButton.getText().equals("جافا") || radioButton.getText().equals("Java")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);

                            } else if (radioButton!= null && !radioButton.getText().equals("جافا") || !radioButton.getText().equals("Java")) {

                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);

                            }

                        }else if(r==4){
                            radioGroup.clearCheck();
                            answer1.setEnabled(true);
                            answer2.setEnabled(true);
                            answer3.setEnabled(true);
                            if(radioButton!=null){
                                radioButton.setBackground(null);}
                            String number3=getResources().getString(R.string.number_Quastion3);
                            number.setText(number3+"");
                            String quastion3=getResources().getString(R.string.name_qustion3);
                            quastion.setText(quastion3+"");
                            String answer31=getResources().getString(R.string.app_answer31);
                            answer1.setText(answer31+"");
                            String answer32=getResources().getString(R.string.app_answer32);
                            answer2.setText(answer32+"");
                            String answer33=getResources().getString(R.string.app_answer33);
                            answer3.setText(answer33+"");
                            String f=getResources().getString(R.string.app_cheak);
                            confirm.setText(f+"");


                        }else if(r==5){
                            String f=getResources().getString(R.string.next_btn);
                            confirm.setText(f+"");
                            int selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = (RadioButton) findViewById(selectedId);
                            if (radioButton==null) {

                            }else

                            if (radioButton.getText() != null && radioButton.getText().equals("جوجل") || radioButton.getText().equals("Google")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);

                            } else if (radioButton!= null && !radioButton.getText().equals("جوجل") || !radioButton.getText().equals("Google")) {

                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);

                            }
                        }else if(r==6){
                            radioGroup.clearCheck();
                            answer1.setEnabled(true);
                            answer2.setEnabled(true);
                            answer3.setEnabled(true);
                            if(radioButton!=null){
                                radioButton.setBackground(null);}
                            String number4=getResources().getString(R.string.number_Quastion4);
                            number.setText(number4+"");
                            String quastion4=getResources().getString(R.string.name_qustion4);
                            quastion.setText(quastion4+"");
                            String answer41=getResources().getString(R.string.app_answer41);
                            answer1.setText(answer41+"");
                            String answer42=getResources().getString(R.string.app_answer42);
                            answer2.setText(answer42+"");
                            String answer43=getResources().getString(R.string.app_answer43);
                            answer3.setText(answer43+"");
                            String f=getResources().getString(R.string.app_cheak);
                            confirm.setText(f+"");



                        }else if(r==7){

                            String f=getResources().getString(R.string.next_btn);
                            confirm.setText(f+"");
                            int selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = (RadioButton) findViewById(selectedId);
                            if (radioButton==null) {

                            }else

                            if (radioButton.getText() != null && radioButton.getText().equals("أندرويد ستوديو") || radioButton.getText().equals("Android Studio")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);

                            } else if (radioButton!= null && !radioButton.getText().equals("أندرويد ستوديو") || !radioButton.getText().equals("Android Studio")) {

                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);


                        }


                    }else if(r==8){
                            radioGroup.clearCheck();
                            answer1.setEnabled(true);
                            answer2.setEnabled(true);
                            answer3.setEnabled(true);
                            if(radioButton!=null){
                                radioButton.setBackground(null);}
                            String number5=getResources().getString(R.string.number_Quastion5);
                            number.setText(number5+"");
                            String quastion5=getResources().getString(R.string.name_qustion5);
                            quastion.setText(quastion5+"");
                            String answer51=getResources().getString(R.string.app_answer51);
                            answer1.setText(answer51+"");
                            String answer52=getResources().getString(R.string.app_answer52);
                            answer2.setText(answer52+"");
                            String answer53=getResources().getString(R.string.app_answer53);
                            answer3.setText(answer53+"");
                            String f=getResources().getString(R.string.app_cheak);
                            confirm.setText(f+"");


                        }else if(r==9){
                            String f=getResources().getString(R.string.quastion_finally);
                            confirm.setText(f+"");
                            int selectedId = radioGroup.getCheckedRadioButtonId();
                            radioButton = (RadioButton) findViewById(selectedId);
                            if (radioButton==null) {

                            }else

                            if (radioButton.getText() != null && radioButton.getText().equals("10") || radioButton.getText().equals("10")) {
                                radioButton.setBackground(getDrawable(R.drawable.desine_answer));
                                result++;
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);

                            } else if (radioButton!= null && !radioButton.getText().equals("10") || !radioButton.getText().equals("10")) {

                                radioButton.setBackground(getDrawable(R.drawable.desin_answerfalse));
                                answer1.setEnabled(false);
                                answer2.setEnabled(false);
                                answer3.setEnabled(false);

                            }


                            }else if(r==10){

                            Intent intent=new Intent(Quize.this,Result.class);
                            intent.putExtra("result", result);
                            startActivity(intent);

                        }



                    }
                },500);




            }

        });
    }}

