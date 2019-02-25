package com.component.login.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.component.base.service.ILoginService;
import com.component.login.LoginActivity;
import com.component.login.R;
import com.component.login.UserFragment;

public class LoginService implements ILoginService {


    @Override
    public void Launcher(Context context, String targetClass) {
        Intent intent = new Intent(context,LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment loadUser(FragmentManager manager, int viewId, Bundle bundle) {
        UserFragment userFragment = new UserFragment();
        userFragment.setArguments(bundle);
        manager.beginTransaction().add(viewId,userFragment).commit();
        return userFragment;
    }

}
