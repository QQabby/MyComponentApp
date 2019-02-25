package com.component.mine.service;

import android.content.Context;
import android.content.Intent;

import com.component.base.service.IMineService;
import com.component.mine.MineActivity;

public class MineService implements IMineService {


    @Override
    public void launcherMine(Context context, String targetClacc) {
        Intent intent = new Intent(context,MineActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
