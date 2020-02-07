package com.example.daggertest;

import android.app.Application;

import com.example.daggertest.dagger.DatabaseModule;
import com.example.daggertest.dagger.NetworkModule;
import com.example.daggertest.dagger.component.AppComponent;
import com.example.daggertest.dagger.component.DaggerAppComponent;


public class App extends Application {

    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder()
                .networkModule(new NetworkModule("ggg"))
                .databaseModule(new DatabaseModule("gggg"))
                .build();
    }

    public static AppComponent getComponent() {
        return component;
    }

}