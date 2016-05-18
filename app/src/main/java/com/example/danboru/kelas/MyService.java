package com.example.danboru.kelas;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Danboru on 18/05/2016.
 * @since 14:44
 *
 */
public class MyService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(getBaseContext(), "Service Mulai", Toast.LENGTH_SHORT) .show();

        return START_STICKY;//apa ini ?
    }



    @Override
    public void onDestroy() {

        super.onDestroy();
        Toast.makeText(getBaseContext(), "Service di Destroy", Toast.LENGTH_SHORT).show();


    }
}
