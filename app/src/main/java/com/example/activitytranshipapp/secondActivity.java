package com.example.activitytranshipapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class secondActivity extends AppCompatActivity {
    ListView lvNO;
    String Number []={ "National Emergency Number -112","Ambulance Number -102","police -100","Fire-101","Women Helpline-1091","Domestic Abuse-181","Railway Enuiry -039","Anti Poisen -1066","Aids Helpline-1097","Road Accident-1072"   };
    ArrayAdapter<String> adapter;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //initialisation
        next=findViewById(R.id.btn2);
        lvNO=findViewById(R.id.lv1);
        adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Number);
        lvNO.setAdapter(adapter);
        registerForContextMenu(lvNO);


        // declaration
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(secondActivity.this,pageRating.class));
            }
        });
    }
}