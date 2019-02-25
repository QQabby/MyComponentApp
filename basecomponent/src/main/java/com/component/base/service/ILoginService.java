package com.component.base.service;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public interface ILoginService {

    void Launcher(Context context,String targetClass);

    Fragment loadUser(FragmentManager manager, int viewId, Bundle bundle);
}
