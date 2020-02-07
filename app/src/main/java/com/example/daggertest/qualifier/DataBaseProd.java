package com.example.daggertest.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

public class DataBaseProd {

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DatabaseProd{
    }

}
