package com.component.mine;

import android.app.Application;

import com.component.base.IApplication;
import com.component.base.service.ServiceFactory;
import com.component.mine.service.MineService;

public class MineApplication extends Application implements IApplication {

    public static Application instance;

    public static Application getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }


    @Override
    public void init(Application app) {
        instance =  app;
        //将实现注册到BaseLibrary
        ServiceFactory.getInstance().setmMineService(new MineService());
    }
}
