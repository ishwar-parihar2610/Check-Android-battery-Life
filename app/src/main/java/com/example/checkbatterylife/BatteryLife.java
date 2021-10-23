package com.example.checkbatterylife;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BatteryLife extends BroadcastReceiver {
    TextView textView;

    BatteryLife(TextView tv) {
    this.textView=tv;

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        int percentage=intent.getIntExtra("level",0);
        if (percentage!=0){
            textView.setText(percentage+"%");
        }

    }
}
