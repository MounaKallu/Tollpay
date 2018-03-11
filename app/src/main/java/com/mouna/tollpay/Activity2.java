package com.mouna.tollpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private Button button2;
    public static final String FROM_1 ="com.mouna.tollpay.FROM_1";
    public static final String TO_1 ="com.mouna.tollpay.TO_1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent =getIntent();
        Intent intent2 =getIntent();

        String text1= intent.getStringExtra(MainActivity.FROM_1);
        String text2= intent.getStringExtra(MainActivity.TO_1);

        TextView textView1 = (TextView) findViewById(R.id.textviewFrom);
        TextView textView2 = (TextView) findViewById(R.id.textviewTo);

        textView1.setText(text1);
        textView2.setText(text2);

        button2 = (Button) findViewById(R.id.detail_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
    }


        public void openActivity3(){

        Intent intent= new Intent(this, Activity4.class);
            TextView spin11=(TextView) findViewById(R.id.textviewFrom);
            String text11= spin11.getText().toString();
            TextView spin22=(TextView) findViewById(R.id.textviewTo);
            String text22= spin22.getText().toString();
            intent.putExtra(FROM_1,text11);
            intent.putExtra(TO_1,text22);
            startActivity(intent);

        startActivity(intent);
    }
}
