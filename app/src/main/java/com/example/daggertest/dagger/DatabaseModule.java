package com.example.daggertest.dagger;

import com.example.daggertest.helpers.DatabaseHelper;
import com.example.daggertest.qualifier.DataBaseProd;
import com.example.daggertest.qualifier.DataBaseTest;
import com.example.daggertest.qualifier.DataBaseTest.DatabaseTest;

import javax.inject.Named;
import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;

import static com.example.daggertest.qualifier.DataBaseProd.*;

@Module
public class DatabaseModule {

    private String text;

    public DatabaseModule(String text) {
        this.text = text;
    }

    //@Named("prod")
    @DatabaseProd
    @Provides
    DatabaseHelper provideDatabaseHelperProd(){
        return new DatabaseHelper();
    }

    //@Named("test")
    @DatabaseTest
    @Provides
    DatabaseHelper provideDatabaseHelperTest(){
        return new DatabaseHelper();
    }
}
