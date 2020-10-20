package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        Button nxt_btn_id,nxt_btn_id2,next_btn_id3,next_btn_id4,next_btn_id5;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nxt_btn_id = findViewById(R.id.nxt_btn_id);

        nxt_btn_id.setOnClickListener(this);


        nxt_btn_id2 = findViewById(R.id.nxt_btn_id2);

        nxt_btn_id2.setOnClickListener(this);

        next_btn_id3 = findViewById(R.id.nxt_btn_id3);
        next_btn_id3.setOnClickListener(this);

        next_btn_id4 = findViewById(R.id.nxt_btn_id4);
        next_btn_id4.setOnClickListener(this);

        next_btn_id5 = findViewById(R.id.nxt_btn_id5);
        next_btn_id5.setOnClickListener(this);

}

        @Override
public void onClick(View v) {
        switch (v.getId()){
        case R.id.nxt_btn_id:
        startActivity(new Intent(MainActivity.this,VerificationActivity_1.class));
        break;

        case R.id.nxt_btn_id2:
        startActivity(new Intent(MainActivity.this,VerificationActivity_2.class));
        break;

        case R.id.nxt_btn_id3:
                startActivity(new Intent(MainActivity.this,PinLayout.class));
                        break;


                case R.id.nxt_btn_id4:
                        startActivity(new Intent(MainActivity.this,LayoutScreen.class));
                        break;

                case R.id.nxt_btn_id5:
                        startActivity(new Intent(MainActivity.this,LayoutScreen2.class));
                        break;



        }
        }
        }
