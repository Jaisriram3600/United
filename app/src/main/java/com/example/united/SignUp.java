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

public class SignUp extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText name,emailt,passwordt;
    private Button signupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        emailt = (EditText)findViewById(R.id.email);
        passwordt =(EditText)findViewById(R.id.password);
        signupbtn = (Button)findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();

        String email = emailt.getText().toString();
        String password = passwordt.getText().toString();


        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String email  = emailt.getText().toString();
               String pass = passwordt.getText().toString();

               pass(email,pass);


            }
        });

       }
public void pass(String email, String pass)
{
    mAuth.createUserWithEmailAndPassword(email, pass)
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        // Sign in success, update UI with the signed-in user's information

                        FirebaseUser user = mAuth.getCurrentUser();
                        Intent intent = new

                    } else {
                        // If sign in fails, display a message to the user.

                        Toast.makeText(SignUp.this, "Authentication failed.",
                                Toast.LENGTH_SHORT).show();
                    }
                }


            });
}}