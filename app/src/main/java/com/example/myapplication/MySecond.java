package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MySecond extends AppCompatActivity {
    private Switch simpleSwitch;
    private TextView statLine;
    private boolean stat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_second);
        simpleSwitch = (Switch) findViewById(R.id.switch1);
        statLine = (TextView) (findViewById(R.id.userStat));

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
    public void myswitch(View view) {
        if (simpleSwitch.isSelected()) {
            stat = true;
            statLine.setText("ONLINE");
            Toast.makeText(this, "YOU ARE NOW ONLINE", Toast.LENGTH_LONG).show();
        }else {statLine.setText("OFFLINE");
            System.out.println("espoir");}

    }
    public void setTexeStat(boolean x)
    {
        if(x==true)
        {
            System.out.println("espoir");

        }
        if(x==false)
        {
            System.out.println("espoir");
        }
    }
}
