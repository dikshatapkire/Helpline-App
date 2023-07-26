package com.example.activitytranshipapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class pageRating extends AppCompatActivity {
    EditText etphn;

    Button btnc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_rating);
        etphn = findViewById(R.id.et1);
        btnc = findViewById(R.id.btn1);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent =new Intent(Intent.ACTION_CALL);
                String mob=etphn.getText().toString();
                if (ActivityCompat.checkSelfPermission(pageRating.this,android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(pageRating.this, "you have granted the permission to call", Toast.LENGTH_SHORT).show();
                    requestPermissionToCall();
                }else{
                    if (mob.isEmpty()){
                        Toast.makeText(pageRating.this,

                                "mobile number cannot be empty", Toast.LENGTH_SHORT).show();
                    }else {
                        callIntent.setData(Uri.parse("tel: "+mob));
                        startActivity(callIntent);
                    }
                }

            }


        });

    }
   
    private void requestPermissionToCall(){
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);
    }
    private class CALL_PHONE {
    }
}