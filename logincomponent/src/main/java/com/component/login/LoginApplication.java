package com.component.login;

import android.app.Application;
import android.util.Log;

import com.component.base.IApplication;
import com.component.base.service.ServiceFactory;
import com.component.login.service.LoginService;

public class LoginApplication extends Application implements IApplication {


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
        instance = app;
        ServiceFactory.getInstance().setmLoginService(new LoginService());
    }
}
