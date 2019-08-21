package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MySecond extends AppCompatActivity {
    private Switch simpleSwitch;
    private TextView statLine;
    private boolean stat;
    private Button search_btn;
    private Button dashboard;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_second);
        simpleSwitch = (Switch) findViewById(R.id.switch1);
        statLine = (TextView) (findViewById(R.id.userStat));
        search_btn=(Button) (findViewById(R.id.btn_search1));
        dashboard=(Button) (findViewById(R.id.button2));




        simpleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked== true) {
                    stat = true;
                    System.out.println("espoir " + stat);
                    statLine.setText("ONLINE");
                }
                else
                {
                    stat = false;
                    System.out.println("ditekemena "+stat);
                    statLine.setText("OFFLINE");
                }


            }
        });


    }
    public void dashboard(View v) {
        intent =new Intent(this,Dashboard.class);
        startActivity(intent);

    }
    public void myswitch(View view) {
        intent =new Intent(this,MyLocation.class);
        startActivity(intent);

    }

}
