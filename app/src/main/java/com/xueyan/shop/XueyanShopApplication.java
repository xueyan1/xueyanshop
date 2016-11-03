package com.xueyan.shop;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


public class XueyanShopApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);
    }
}
