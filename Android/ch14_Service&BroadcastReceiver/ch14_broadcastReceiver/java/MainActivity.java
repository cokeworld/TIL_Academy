package com.example.ch14_broadcastreceiver;

import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivBattery;
    EditText edtBattery;

    MyBR mBR;

//    BroadcastReceiver br = new BroadcastReceiver() {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//
//        }
//    };

//    public MainActivity(){
//        mBR = new MyBR(MainActivity.this);
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배터리 상태 체크");

        ivBattery = (ImageView) findViewById(R.id.ivBattery);
        edtBattery = (EditText) findViewById(R.id.edtBattery);

//        mBR = new MyBR(MainActivity.this);
        mBR = new MyBR(ivBattery, edtBattery);

//        IntentFilter iFilter = new IntentFilter();
//        iFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
//        registerReceiver(mBR, iFilter);

    }

    //    BroadcastReceiver br = new BroadcastReceiver() {
//        @Override
//        public void onReceive(Context context, Intent intent) {
//
//        }
//    };
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mBR);
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter iFilter = new IntentFilter();
        iFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(mBR, iFilter);
    }

}
