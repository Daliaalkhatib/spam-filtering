package com.example.spamfilteringusingai_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent getemail=getIntent();
        String uemail=getemail.getStringExtra("email");
        EditText pass=(EditText)findViewById(R.id.password_check);
        Button button=(Button)findViewById(R.id.loginbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //code for login operation 2
                String password=pass.getText().toString();
                //login with GmailApi
            }
        });
    }
}