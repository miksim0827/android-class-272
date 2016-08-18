package com.example.user.simpleui;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by user on 2016/8/16.
 */
public class SimpleUIApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Drink.class);
        ParseObject.registerSubclass(DrinkOrder.class);
        ParseObject.registerSubclass(Order.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("C2SeDf62RfpRQMvutuERRfqWGTlrVeVazgrVViF7")
                .server("https://parseapi.back4app.com/")
                .clientKey("7VREEc0GFWRsDYrZE88khFHkXz8meYHZvTHpE4Tx")
                        .enableLocalDataStore()
                        .build()
        );
    }
}
