package com.component.base.impl;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.component.base.service.ILoginService;

public class EmptyLogin implements ILoginService {
    @Override
    public void Launcher(Context context, String targetClass) {

    }

    @Override
    public Fragment loadUser(FragmentManager manager, int viewId, Bundle bundle) {
        return null;
    }
}
