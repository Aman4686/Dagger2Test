package com.example.daggertest.dagger;

import com.example.daggertest.helpers.HttpClient;
import com.example.daggertest.helpers.NetworkUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    private String text;

    public NetworkModule(String text) {
        this.text = text;
    }

    @Provides
    NetworkUtils provideNetworkUtils(HttpClient httpClient){
        return new NetworkUtils(httpClient);
    }

    @Provides
    HttpClient provideHttpClient(){
        return new HttpClient();
    }

}
