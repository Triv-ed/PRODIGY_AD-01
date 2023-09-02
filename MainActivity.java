package com.example.mycalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btne,btna,btns,btnm,btnd,btnc,btndot;
    EditText edt1;
    Float mv1,mv2;
    boolean madd,msub,mdiv,mmul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.buttonone);
        btn2=(Button) findViewById(R.id.buttontwo);
        btn3=(Button) findViewById(R.id.buttonthree);
        btn4=(Button) findViewById(R.id.buttonfour);
        btn5=(Button) findViewById(R.id.buttonfive);
        btn6=(Button) findViewById(R.id.buttonsix);
        btn7=(Button) findViewById(R.id.buttonsevn);
        btn8=(Button) findViewById(R.id.buttoneigt);
        btn9=(Button) findViewById(R.id.buttonnin);
        btn0=(Button) findViewById(R.id.buttonzero);
        btna=(Button) findViewById(R.id.buttonplus);
        btns=(Button) findViewById(R.id.buttonmin);
        btnm=(Button) findViewById(R.id.buttonmul);
        btnd=(Button) findViewById(R.id.buttondiv);
        btne=(Button) findViewById(R.id.buttoneql);
        btndot=(Button) findViewById(R.id.buttondot);
        btnc=(Button) findViewById(R.id.buttonclr);
        edt1=(EditText) findViewById(R.id.edt1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt1.setText(edt1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt1.setText(edt1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt1.setText(edt1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt1.setText(edt1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt1.setText(edt1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt1.setText(edt1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt1.setText(edt1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edt1.setText(edt1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText(edt1.getText()+"0");
            }
        });
       btna.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(edt1==null)
                   edt1.setText("");
               else{
                   mv1=Float.parseFloat(edt1.getText()+"");
                   madd=true;
                   edt1.setText(null);

               }
           }
       });
       btns.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mv1=Float.parseFloat(edt1.getText()+"");
               msub=true;
               edt1.setText(null);
           }
       });
       btnm.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mv1=Float.parseFloat(edt1.getText()+"");
               mmul=true;
               edt1.setText(null);
           }
       });
       btnd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mv1=Float.parseFloat(edt1.getText()+"");
               mdiv=true;
               edt1.setText(null);
           }
       });
       btne.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               mv2=Float.parseFloat(edt1.getText()+"");
               if(madd==true){
                   edt1.setText(mv1+mv2+"");
                   madd=false;
               }
               if(msub==true){
                   edt1.setText(mv1-mv2+"");
                   msub=false;
               }
               if(mmul==true){
                   edt1.setText(mv1*mv2+"");
                   mmul=false;
               }
               if(mdiv==true){
                   edt1.setText(mv1/mv2+"");
                     mdiv=false;
               }
           }
       });
       btndot.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               edt1.setText(edt1.getText()+".");
           }
       });
       btnc.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               edt1.setText("");
           }
       });
    }

    @Override
    public void onClick(View view) {

    }
}