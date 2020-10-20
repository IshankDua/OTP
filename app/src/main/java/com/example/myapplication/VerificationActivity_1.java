package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class VerificationActivity_1 extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    Button btread;

    String code;
    public  String v1;
    public  String v2;
    public String v3;
    public String v4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_1);
        et1 = (EditText) findViewById(R.id.et_1);
        et2 = (EditText) findViewById(R.id.et_2);
        et3 = (EditText) findViewById(R.id.et_3);
        et4 = (EditText) findViewById(R.id.et_4);
        btread = (Button) findViewById(R.id.btread);



        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                v1=et1.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() == 1) {
                    et2.requestFocus();
                }

                if (s.toString().length() == 0) {
                    et1.requestFocus();
                }
            }
        });




        et2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s.toString().length() == 1) {
                    et2.requestFocus();
                }

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                v2=et2.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() == 1) {
                    et3.requestFocus();
                }

                if (s.toString().length() == 0) {
                    et1.requestFocus();
                }

            }
        });



        et3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s.toString().length() == 1) {
                    et3.requestFocus();
                }

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                v3=et3.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() == 1) {
                    et4.requestFocus();
                }

                if (s.toString().length() == 0) {
                    et2.requestFocus();
                }

            }
        });


        et4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                v4=et4.getText().toString();
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() == 1){
                  btread.requestFocus();
                }

                if (s.toString().length() == 0){
                    et3.requestFocus();
//                    et3.setText("");
                }

            }
        });

//        btread.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                code=v1+v2+v3+v4;
//                Log.e("", "Coding "+code );
//                Toast.makeText(VerificationActivity_1.this, "Login Successfull", Toast.LENGTH_SHORT).show();
//                Toast.makeText(VerificationActivity_1.this, "OTP = "+code, Toast.LENGTH_SHORT).show();
//            }
//        });



    }

    public void submit(View view){


        code=v1+v2+v3+v4;
        Log.e("", "Coding "+code );
        Toast.makeText(VerificationActivity_1.this, "Login Successfull", Toast.LENGTH_SHORT).show();
        Toast.makeText(VerificationActivity_1.this, "OTP = "+code, Toast.LENGTH_SHORT).show();


    }
}