package com.android.router.callback;

/**
 * Created by liuzhao on 2017/9/17.
 */

public interface IRouterCallBack {

    void onFound();

    void onLost();

    void onOpenSuccess();

    void onOpenFailed();
}
