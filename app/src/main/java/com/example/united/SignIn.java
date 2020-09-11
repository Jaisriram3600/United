package com.example.united;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignIn extends AppCompatActivity {
    private EditText email,pass;
    private FirebaseAuth mAuth;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = (EditText)findViewById(R.id.etedit);
        pass = (EditText)findViewById(R.id.etpass);

        btn = (Button)findViewById(R.id.signbtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email3 = email.getText().toString();
                String pass3 =  pass.getText().toString();

    }
});}

void emailpass(String email3,String pass3)
{
    mAuth.signInWithEmailAndPassword(email3, pass3)
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        // Sign in success, update UI with the signed-in user's information

                        FirebaseUser user = mAuth.getCurrentUser();
                        Intent

                    } else {
                        // If sign in fails, display a message to the user.

                        Toast.makeText(SignIn.this, "Authentication failed.",
                                Toast.LENGTH_SHORT).show();

                    }

                }
            });
}}