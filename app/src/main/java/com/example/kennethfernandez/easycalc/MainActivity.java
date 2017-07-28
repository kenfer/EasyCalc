package com.example.kennethfernandez.easycalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   TextView result;
    EditText firstnumber , secondnumber;
    Button add, subtract, multiply, divide;


float result_num;
    int num1, num2;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
      firstnumber = (EditText) findViewById(R.id.firstnumber);
        secondnumber = (EditText) findViewById(R.id.secondnumber);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);


        add.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
            num1 = Integer.parseInt(firstnumber.getText().toString());
            num2 = Integer.parseInt(secondnumber.getText().toString());
                result_num = num1 + num2;

                result.setText(String.valueOf(result_num));
            }


        });

        subtract.setOnClickListener(new View.OnClickListener(){


                @Override
                public void onClick(View v){
                    num1 = Integer.parseInt(firstnumber.getText().toString());
                    num2 = Integer.parseInt(secondnumber.getText().toString());
                    result_num = num1 - num2;
                    result.setText(String.valueOf(result_num));



            }



        });

       multiply.setOnClickListener(new View.OnClickListener(){


                @Override
                public void onClick (View v){
                    num1 = Integer.parseInt(firstnumber.getText().toString());
                    num2 = Integer.parseInt(secondnumber.getText().toString());
                    result_num = num1 + num2;
                    result.setText(String.valueOf(result_num));
                }






        });

        divide.setOnClickListener(new View.OnClickListener(){


                @Override
                public void onClick (View v){
                    num1 = Integer.parseInt(firstnumber.getText().toString());
                    num2 = Integer.parseInt(secondnumber.getText().toString());
                    result_num = num1 / num2;
                    result.setText(String.valueOf(result_num));
                }





        });





    }
}
