package com.mouna.tollpay;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    private Button button1;
    public static final String FROM_1 ="com.mouna.tollpay.FROM_1";
    public static final String TO_1 ="com.mouna.tollpay.TO_1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        button1 = (Button) findViewById(R.id.home_nextbutton);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

        Spinner spinnerfrom=findViewById(R.id.spinnerFrom);
        ArrayAdapter<CharSequence> adapterfrom= ArrayAdapter.createFromResource(this ,R.array.fromlist,android.R.layout.simple_spinner_item);
        adapterfrom.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerfrom.setAdapter(adapterfrom);
        spinnerfrom.setOnItemSelectedListener(this);
        Spinner spinnerto=findViewById(R.id.spinnerTo);
        ArrayAdapter<CharSequence> adapterto= ArrayAdapter.createFromResource(this ,R.array.tolist,android.R.layout.simple_spinner_item);
        adapterto.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerto.setAdapter(adapterto);
        spinnerto.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),text,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void openActivity2(){
        Spinner spin1=(Spinner) findViewById(R.id.spinnerFrom);
        String text1= spin1.getSelectedItem().toString();
        Spinner spin2=(Spinner) findViewById(R.id.spinnerTo);
        String text2= spin2.getSelectedItem().toString();
        Intent intent= new Intent(this, Activity2.class);
        intent.putExtra(FROM_1,text1);
        intent.putExtra(TO_1,text2);
        startActivity(intent);
    }
}