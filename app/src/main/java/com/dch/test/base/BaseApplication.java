package com.dch.test.base;

import android.support.multidex.MultiDexApplication;

/**
 * 作者：${User} on 2017/4/10 16:41
 * 描述：
 * 邮箱：daichuanhao@caijinquan.com
 */
public class BaseApplication extends MultiDexApplication {
    public static BaseApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }


}
