package com.example.united;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class  MainActivity2 extends AppCompatActivity {
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mAuth = FirebaseAuth.getInstance();

    }

    // idhu onstart appo user already sign in panirukana check panum paniruntha ulla poirum
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null) {

            Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(intent);
            finish();
        }
        else{

        }

}

//idhu namma action bar la menu option ah add panradhuku

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    // menu la logout option oda code
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);

         if(item.getItemId()==R.id.logout);
        {
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(intent);
            finish();
        }
        return true;
    }
}