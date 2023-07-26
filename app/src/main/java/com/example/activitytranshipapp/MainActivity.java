package com.example.activitytranshipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //declaration
    Button btnext;
    EditText email,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiasation
        btnext=findViewById(R.id.btn1);
        email=findViewById(R.id.et1);
        pass=findViewById(R.id.et2);




        //handler
        btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email =email.getText().toString().trim();
                String Password=pass.getText().toString().trim();
                startActivity(new Intent(MainActivity.this,secondActivity.class));
            }
        });
    }

}