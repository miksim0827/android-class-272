package com.example.user.simpleui;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by user on 2016/8/16.
 */
public class SimpleUIApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)  //this = context
                .applicationId("C2SeDf62RfpRQMvutuERRfqWGTlrVeVazgrVViF7")
                .server("https://parseapi.back4app.com/")
                .clientKey("7VREEc0GFWRsDYrZE88khFHkXz8meYHZvTHpE4Tx")
                .build()
        );
    }
}
