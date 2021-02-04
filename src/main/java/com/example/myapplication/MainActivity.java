package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView, textView2;
    ImageView imageView;
    String currentBatterytemp="Current Battery temp :";
    IntentFilter intentFilter;
    Float batteryTemp;
    //View screenView;

    ConstraintLayout clayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button =(Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        clayout1 = (ConstraintLayout) findViewById((R.id.activity_main));

        //screenView = findViewById(R.id.activity_main);

        intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity.this.registerReceiver(broadcastreceiver, intentFilter);


            }
        });
    }

    public BroadcastReceiver broadcastreceiver= new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            batteryTemp = (float)(intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE,0))/10;

            if(batteryTemp>30)
            {
                clayout1.setBackgroundColor(Color.RED);
                textView2.setText("You have over used your device.Please Stop!");
            }
            else if ((26 <= batteryTemp) && (batteryTemp <= 30))
            {
                clayout1.setBackgroundColor(Color.GREEN);
                textView2.setText("Your device is stable now but may soon lose its temper!");
            }
            else
            {
                clayout1.setBackgroundColor(Color.BLUE);
                textView2.setText("Your device is as cool as you are!");
            }

            textView.setText(currentBatterytemp+ " " +batteryTemp+" " + "\u2103");

        }
    };

}