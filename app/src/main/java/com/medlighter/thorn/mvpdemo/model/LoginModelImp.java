package com.medlighter.thorn.mvpdemo.model;

import android.text.TextUtils;

import com.medlighter.thorn.mvpdemo.bean.User;
import com.medlighter.thorn.mvpdemo.intef.ILoginInterface;

/**
 * @author: Thorn
 * @date: 2016/6/10.
 * @email: http://www.github.com/ostea
 */

public class LoginModelImp implements IloginModel {
    @Override
    public void login(final String userName, final String pswd, final ILoginInterface iLoginInterface) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2 * 1000);
                } catch (Exception e) {
                }
                // 模拟耗时操作
                if (TextUtils.equals("chengchao", userName) && TextUtils.equals("qy123456", pswd)) {
                    User user = new User(userName, pswd);
                    iLoginInterface.loginSuccess(user);
                } else {
                    iLoginInterface.loginFail();
                }
            }
        }).start();
    }

    @Override
    public void getUserInfo(String userName, String mToken) {

    }
}
