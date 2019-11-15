package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,mul,div,sum,sub,equal,clear;
    private TextView res,build;
    private final char ADD='+';
    private final char SUBTRACT='-';
    private final char DIVISION='/';
    private final char MULTIPLY='*';
    private char CH;
    private final char EQUAL=0;
    private Double num1=Double.NaN;
    private Double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDisplay();

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "0");
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "1");
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "2");
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "3");
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "4");
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "5");
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "7");
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "8");
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setText(build.getText().toString() + "9");
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                CH=ADD;
                res.setText(String.valueOf(num1)+ "+");
                build.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                CH=SUBTRACT;
                res.setText(String.valueOf(num1) + "-");
                build.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                CH=MULTIPLY;
                res.setText(String.valueOf(num1) + "*");
                build.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                CH=DIVISION;
                res.setText(String.valueOf(num1) + "/");
                build.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                compute();
                CH=EQUAL;
                res.setText(res.getText().toString() + String.valueOf(num2) + "=" + String.valueOf(num1));
                build.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(build.getText().length()>0){
                    CharSequence cs=build.getText().toString();
                    build.setText(cs.subSequence(0,build.getText().length()-1));
                }
                else{
                    num1=Double.NaN;
                    num2=Double.NaN;
                    res.setText(null);
                    build.setText(null);
                }
            }
        });


    }
     public void setDisplay()
     {
         n1=(Button)findViewById(R.id.n1);
         n2=(Button)findViewById(R.id.n2);
         n3=(Button)findViewById(R.id.n3);
         n4=(Button)findViewById(R.id.n4);
         n5=(Button)findViewById(R.id.n5);
         n6=(Button)findViewById(R.id.n6);
         n7=(Button)findViewById(R.id.n7);
         n8=(Button)findViewById(R.id.n8);
         n9=(Button)findViewById(R.id.n9);
         n0=(Button)findViewById(R.id.n0);
         mul=(Button)findViewById(R.id.mul);
         div=(Button)findViewById(R.id.div);
         sum=(Button)findViewById(R.id.sum);
         sub=(Button)findViewById(R.id.sub);
         res=(TextView) findViewById(R.id.res);
         build=(TextView)findViewById(R.id.build);
         equal=findViewById(R.id.equal);
         clear=findViewById(R.id.clear);

     }

    private void compute(){
        if(!Double.isNaN(num1)){
            num2=Double.parseDouble(build.getText().toString());
            switch (CH){
                case ADD:
                    num1=num1+num2;
                    break;
                case SUBTRACT:
                    num1=num1-num2;
                    break;
                case DIVISION:
                    num1=num1/num2;
                    break;
                case MULTIPLY:
                    num1=num1*num2;
                    break;
                case EQUAL:
                    break;
            }
        }
        else{
            num1=Double.parseDouble(build.getText().toString());
        }
    }

}
