package com.example.component;

import android.app.Application;
import android.util.Log;

import com.component.base.AppConfig;
import com.component.base.IApplication;

public class MyApplication extends Application implements IApplication {


    public static MyApplication application;
    public MyApplication getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        init(this);
    }


    @Override
    public void init(Application app) {

        application = (MyApplication) app;
        for(String component : AppConfig.COMPONENTS){
            try {
                Class<?> clazz = Class.forName(component);
                Object obj = clazz.newInstance();

                if(obj instanceof IApplication){
                    ((IApplication) obj).init(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
