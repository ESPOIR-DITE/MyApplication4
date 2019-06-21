package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button logIn;
    private Button forget;
    private EditText userName;
    private EditText password;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logIn=(Button)findViewById(R.id.Lbutton);
        forget=(Button)findViewById(R.id.Fbutton);
        userName=(EditText)findViewById(R.id.userName);
        password=(EditText)findViewById(R.id.password);

    }
    public void move(View view)
    {
        intent =new Intent(this,MySecond.class);
            userName.setText("");
            password.setText("");
           //Toast.makeText(this, "wrong password\nwrong password", Toast.LENGTH_LONG).show();

            startActivity(intent);

    }
    public void forg(View view)
    {
        Intent intent1 =new Intent(this,NewActivity.class);
        startActivity(intent1);
    }
}
