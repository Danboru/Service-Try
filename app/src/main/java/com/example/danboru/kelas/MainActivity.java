package com.example.danboru.kelas;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public ComponentName startService(View view) {
            startService(new Intent(getBaseContext(), MyService.class));
    }


    @Override
    public boolean stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));


}
