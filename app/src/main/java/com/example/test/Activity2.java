package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final EditText name= (EditText) findViewById(R.id.name);
        final EditText birth= (EditText) findViewById(R.id.age);
        final RadioGroup group= (RadioGroup) findViewById(R.id.radio);
        final RadioButton female= (RadioButton) findViewById(R.id.F);
        final RadioButton male= (RadioButton) findViewById(R.id.M);
        final RadioButton ins= (RadioButton) findViewById(R.id.ins);
        final RadioButton stud= (RadioButton) findViewById(R.id.stud);
        final TextView message= (TextView) findViewById(R.id.msg);
        final Button act1_2= (Button) findViewById(R.id.bt1_2);
        final Button act3_2= (Button) findViewById(R.id.bt3_2);
        final Button submit= (Button) findViewById(R.id.submit);

        act1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2tos1= new Intent(Activity2.this,MainActivity.class);
                startActivity(s2tos1);
            }
        });

        act3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s2tos3= new Intent(Activity2.this,Activity3.class);
                startActivity(s2tos3);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(name!=null && birth!=null){
                   if(male.isChecked())
                   {
                       message.setText("Hello Mr. "+name.getText()+", You are "
                               +(2021-Integer.parseInt(birth.getText().toString())));
                   }
                   if(female.isChecked())
                   {
                       message.setText("Hello Ms. "+name.getText()+", You are "
                               +(2021-Integer.parseInt(birth.getText().toString())));
                   }
                   if(ins.isChecked())
                   {
                       message.setText("Hello Professor "+name.getText());
                   }

                   else
                       Toast.makeText(Activity2.this,
                               "Please enter all info",Toast.LENGTH_LONG).show();
               }
            }
        });






    }
}