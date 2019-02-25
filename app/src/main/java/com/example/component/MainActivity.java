package com.example.component;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.component.base.service.ServiceFactory;

/**
 * 组件化示例
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 跳转登录
     * @param view
     */
    public void goLogin(View view) {

        //跳转到登录界面
        ServiceFactory.getInstance().getmLoginService().Launcher(this,"");
    }

    public void goMine(View view) {
        ServiceFactory.getInstance().getmMineService().launcherMine(this,"");
    }

    public void loadFragment(View view){
        Bundle bundle = new Bundle();
        //可以添加数据
        ServiceFactory.getInstance().getmLoginService().loadUser(getSupportFragmentManager(),R.id.container,bundle);
    }
}
