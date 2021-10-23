package com.example.checkbatterylife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.example.checkbatterylife.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    BatteryLife batteryLife;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
      batteryLife=new BatteryLife(binding.text);
      registerReceiver(batteryLife, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(batteryLife);
    }
}