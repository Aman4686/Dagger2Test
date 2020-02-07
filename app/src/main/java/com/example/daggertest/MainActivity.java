package com.example.daggertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.os.Bundle;

import com.example.daggertest.helpers.DatabaseHelper;
import com.example.daggertest.helpers.HttpClient;
import com.example.daggertest.helpers.NetworkUtils;
import com.example.daggertest.qualifier.DataBaseProd;
import com.example.daggertest.qualifier.DataBaseProd.DatabaseProd;
import com.example.daggertest.qualifier.DataBaseTest;
import com.example.daggertest.qualifier.DataBaseTest.DatabaseTest;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkUtils networkUtils;

    //@Named("test")
    @DatabaseTest
    Lazy<DatabaseHelper> dateBaseHelperProviderTest;

    //@Named("prod")
    @DatabaseProd
    DatabaseHelper dateBaseHelperProd;

    HttpClient httpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getComponent().infectMainActivity(this);
        httpClient = App.getComponent().getHttpClient();

        DatabaseHelper databaseHelper = dateBaseHelperProviderTest.get();
    }
}
