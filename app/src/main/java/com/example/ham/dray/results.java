package com.example.ham.dray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class results extends AppCompatActivity {
 Button btn2;
 TextView txtV1;
 TextView txtV2;
 String nameFro;
 String passFro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        btn2=(Button)findViewById(R.id.button3);
        txtV1=(TextView)findViewById(R.id.textView5);
        txtV2=(TextView)findViewById(R.id.textView4);
        nameFro=getIntent().getExtras().getString("value");
        passFro=getIntent().getExtras().getString("values");
        txtV2.setText(nameFro);

    }
    public void btn2click(View v){
        Intent i =new Intent(this,MainActivity.class);
        startActivity(i);
        finish();
    }
}
