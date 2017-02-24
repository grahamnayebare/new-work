package com.example.ham.dray;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button btn;
 EditText edtText,edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        edtText=(EditText)findViewById(R.id.editText);
        edt=(EditText)findViewById(R.id.editText3);
    }
    public void btnClick(View v){
        String name=edtText.getText().toString();
        String pass=edt.getText().toString();
        Intent i = new Intent(this,results.class);
        i.putExtra("value",name);
        i.putExtra("values",pass);
        startActivity(i);
        finish();


    }
}
