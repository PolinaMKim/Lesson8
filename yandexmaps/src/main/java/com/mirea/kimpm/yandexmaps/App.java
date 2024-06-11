package com.mirea.kimpm.yandexmaps;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        String MAPKIT_API_KEY = "d8124162-c91a-4709-b5c5-0b6484feac64";
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}