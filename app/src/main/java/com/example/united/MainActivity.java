package com.example.united;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.hololo.tutorial.library.PermissionStep;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

import java.util.prefs.Preferences;

public class MainActivity extends TutorialActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //sharedpreference vechu namma chinna information ah store panikalam like user settings or logged in
        //check if the app is opened for the first time

       SharedPreferences sp = getSharedPreferences("HJDHJD",MODE_PRIVATE);

       String Startedfirst = sp.getString("JO","");

       if(Startedfirst.equals("Yes"))
       {
           Intent intent = new Intent(MainActivity.this,MainActivity2.class);
           startActivity(intent);
           finish();
       }
       else {
           SharedPreferences.Editor editor = sp.edit();
           editor.putString("JO","Yes");
           editor.apply();
       }



        addFragment(new Step.Builder().setTitle("Hey Guys I'm Jaisriram ")
                .setContent("I've created this app only for us to stay connected even after finishing our college" +
                        " Hope you like it")


                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.nerd) // int top drawable
                .setSummary("")
                .build());
        // Permission Step
        addFragment(new Step.Builder().setTitle("Welcome to United ")
                .setContent("Text with ur friends and enjoy    ")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.friends) // int top drawable
                .setSummary("")
                .build());




        }

    @Override
    public void finishTutorial() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void currentFragmentPosition(int position) {

    }
}