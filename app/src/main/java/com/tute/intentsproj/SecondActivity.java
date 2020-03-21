package com.tute.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView tx1;
    private TextView tx2;
    private TextView txtResult;
    private Button btnAdd;
    private Button btnSubst;
    private Button btnMulti;
    private Button btnDivide;
    private String intp1;
    private String intp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tx1= findViewById(R.id.textView12);
        tx2= findViewById(R.id.textView13);
        txtResult= findViewById(R.id.textView5);
        btnAdd = findViewById(R.id.button8);
        btnSubst = findViewById(R.id.button9);
        btnMulti = findViewById(R.id.button5);
        btnDivide = findViewById(R.id.button2);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(tx1.getText().toString().length()==0){

                    tx1.setText("0");

                }
                if(tx2.getText().toString().length()==0){

                    tx2.setText("0");

                }

                int num1 = Integer.parseInt(tx1.getText().toString());
                int num2 = Integer.parseInt(tx2.getText().toString());

                int sum = num1 + num2;

                txtResult.setText(String.valueOf(sum));

            }

        });
        btnSubst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tx1.getText().toString().length()==0){

                    tx1.setText("0");

                }
                if(tx2.getText().toString().length()==0){

                    tx2.setText("0");

                }

                int num1 = Integer.parseInt(tx1.getText().toString());
                int num2 = Integer.parseInt(tx2.getText().toString());

                int sum = num1 - num2;

                txtResult.setText(String.valueOf(sum));

            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            if (tx1.getText().toString().length() == 0) {

                                                tx1.setText("0");

                                            }
                                            if (tx2.getText().toString().length() == 0) {

                                                tx2.setText("0");

                                            }

                                            int num1 = Integer.parseInt(tx1.getText().toString());
                                            int num2 = Integer.parseInt(tx2.getText().toString());

                                            int sum = num1 * num2;
                                            txtResult.setText(String.valueOf(sum));
          }

        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             if (tx1.getText().toString().length() == 0) {

                                                 tx1.setText("0");

                                             }
                                             if (tx2.getText().toString().length() == 0) {

                                                 tx2.setText("0");

                                             }

                                             int num1 = Integer.parseInt(tx1.getText().toString());
                                             int num2 = Integer.parseInt(tx2.getText().toString());

                                             int sum = num1 / num2;

                                             txtResult.setText(String.valueOf(sum));

                                         }

                                     });

        intp1= getIntent().getExtras().getString("Value");
        intp2= getIntent().getExtras().getString("Value1");
        tx1.setText(intp1);
        tx2.setText(intp2);


    }
}
