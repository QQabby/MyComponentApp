package com.component.base.service;

import com.component.base.impl.EmptyLogin;
import com.component.base.impl.EmptyMine;

public class ServiceFactory {

    private ServiceFactory(){}

    private static ServiceFactory instance = new ServiceFactory();

    public static ServiceFactory getInstance(){
        return instance;
    }

    private ILoginService mLoginService;
    private IMineService mMineService;

    public ILoginService getmLoginService() {
        //当组件被删除时,避免出现崩溃
        if(mLoginService == null){
            return new EmptyLogin();
        }
        return mLoginService;
    }

    public void setmLoginService(ILoginService mLoginService) {

        this.mLoginService = mLoginService;
    }

    public IMineService getmMineService() {
        if(mMineService == null){
            return new EmptyMine();
        }
        return mMineService;
    }

    public void setmMineService(IMineService mMineService) {
        this.mMineService = mMineService;
    }
}
