package com.example.daggertest.dagger.component;

import androidx.core.app.NotificationCompat;

import com.example.daggertest.MainActivity;
import com.example.daggertest.dagger.DatabaseModule;
import com.example.daggertest.dagger.NetworkModule;
import com.example.daggertest.helpers.HttpClient;

import javax.inject.Named;

import dagger.Component;

@Component(modules = {DatabaseModule.class , NetworkModule.class})
public interface AppComponent {
   void infectMainActivity(MainActivity mainActivity);

   HttpClient getHttpClient();

   //todo get @Named example
   //@Named("named")
   HttpClient getHttpClientNamed();

   //@Named("empty")
   HttpClient getHttpClientEmpty();
}
