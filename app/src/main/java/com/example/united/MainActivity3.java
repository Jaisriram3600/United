package com.example.united;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private TextView Signup,Signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

         Signup = (TextView)findViewById(R.id.signup);
         Signin =(TextView)findViewById(R.id.signin);

         Signup.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent2 = new Intent(MainActivity3.this,SignUp.class);
                 startActivity(intent2);
             }
         });

         Signin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity3.this,SignIn.class);
                 startActivity(intent);
             }
         });

    }
}