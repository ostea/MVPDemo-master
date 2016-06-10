package com.medlighter.thorn.mvpdemo.view;

import com.medlighter.thorn.mvpdemo.bean.User;

/**
 * @author: Thorn
 * @date: 2016/6/10.
 * @email: http://www.github.com/ostea
 */

public interface ILoginView {
    String getUsername();
    String getPassword();

    void showPb();
    void hidePb();

    void loginSuccess(User user);
    void showLoginFail();

    void clearUsername();
    void clearPswd();
}
