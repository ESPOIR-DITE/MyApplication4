package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
    Button restBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        restBtn=(Button)(findViewById(R.id.RestBtn));
    }
    public void passwordRequest(View view)
    {   // we must get the id of the user and check in the database and respond
        // we must email the user
        // we need to request he user to verify the email address or the sms
        Intent intent= new Intent(this,PasswordReqeust.class);
        startActivity(intent);

    }
}
