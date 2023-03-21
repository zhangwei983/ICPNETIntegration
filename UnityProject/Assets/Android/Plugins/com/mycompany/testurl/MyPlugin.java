package com.mycompany.testurl;

import android.app.Activity;
import android.util.Log;

import com.unity3d.player.UnityPlayer;

public class MyPlugin {
    static final String TAG_PLUGIN = "MyPlugin";

    static MyPlugin mMyPlugin;

    private MyPluginCallback mMyPluginCallback;

    public static MyPlugin initImpl(MyPluginCallback pluginCallback)
    {
        if (mMyPlugin != null)
            return mMyPlugin;

        mMyPlugin = new MyPlugin();
        mMyPlugin.init(pluginCallback);

        return mMyPlugin;
    }

    public void init(MyPluginCallback pluginCallback) {
        mMyPluginCallback = pluginCallback;
    }

    public void sendMessage(int number){
        Log.i(TAG_PLUGIN, "SendMessage is called.");

        if (mMyPluginCallback != null)
        {
            mMyPluginCallback.onSendMessage(number);
        }
    }
}
