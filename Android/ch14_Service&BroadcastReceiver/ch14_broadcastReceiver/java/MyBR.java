package com.example.ch14_broadcastreceiver;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.EditText;
import android.widget.ImageView;

public class MyBR extends BroadcastReceiver
{
    //1.멤버변수
//    Activity act;
    ImageView ivBattery;
    EditText edtBattery;

    //2.생성자

//    public  MyBR(){};

//    public MyBR(Activity act) {
//        this.act = act;
//    }

    public MyBR(ImageView ivBattery, EditText edtBattery) {
        this.ivBattery = ivBattery;
        this.edtBattery = edtBattery;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (action.equals(Intent.ACTION_BATTERY_CHANGED)) {
            int remain = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            edtBattery.setText("현재 충전량 : " + remain + "\n");

            if (remain >= 90)
                ivBattery.setImageResource(R.drawable.battery_100);
            else if (remain >= 70)
                ivBattery.setImageResource(R.drawable.battery_80);
            else if (remain >= 50)
                ivBattery.setImageResource(R.drawable.battery_60);
            else if (remain >= 10)
                ivBattery.setImageResource(R.drawable.battery_20);
            else
                ivBattery.setImageResource(R.drawable.battery_0);

            int plug = intent.getIntExtra(BatteryManager.EXTRA_PLUGGED, 0);
            switch (plug) {
                case 0:
                    edtBattery.append("전원 연결 : 안됨");
                    break;
                case BatteryManager.BATTERY_PLUGGED_AC:
                    edtBattery.append("전원 연결 : 어댑터 연결됨");
                    break;
                case BatteryManager.BATTERY_PLUGGED_USB:
                    edtBattery.append("전원 연결 : USB 연결됨");
                    break;
            }
        }
    }
}
