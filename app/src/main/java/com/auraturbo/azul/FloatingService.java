package com.auraturbo.azul;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class FloatingService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Aquí irá la lógica para mostrar el panel flotante
        return START_STICKY;
    }
}

