package com.mouna.tollpay;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    Button gen, scan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Intent intent =getIntent();
        String text11= intent.getStringExtra(Activity2.FROM_1);
        String text22= intent.getStringExtra(Activity2.TO_1);

        TextView textView1 = (TextView) findViewById(R.id.textviewFrom);
        TextView textView2 = (TextView) findViewById(R.id.textviewTo);

        textView1.setText(text11);
        textView2.setText(text22);


    }

}
