package com.rex.hwong;

import android.app.Application;
import android.content.Context;

/**
 * @author dong {hwongrex@gmail.com}
 * @date 16/7/5
 * @time 下午3:49
 */

public class ZakerApp extends Application{
    public static ZakerApp zakerApp = null;

    @Override
    public void onCreate() {
        super.onCreate();
        zakerApp = this;
    }

    public static Context getContext(){
        return zakerApp;
    }
}
