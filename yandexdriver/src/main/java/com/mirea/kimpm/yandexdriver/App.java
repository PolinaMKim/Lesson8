package com.mirea.kimpm.yandexdriver;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String MAPKIT_API_KEY = "d8124162-c91a-4709-b5c5-0b6484feac64";
    @Override
    public void onCreate() {
        super.onCreate();

        // Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}