package com.medlighter.thorn.mvpdemo.intef;

import com.medlighter.thorn.mvpdemo.bean.User;

/**
 * @author: Thorn
 * @date: 2016/6/10.
 * @email: http://www.github.com/ostea
 */

public interface ILoginInterface {

    void loginSuccess(User user);
    void loginFail();
}
