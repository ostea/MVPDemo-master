package com.medlighter.thorn.mvpdemo.model;

import com.medlighter.thorn.mvpdemo.intef.ILoginInterface;

/**
 * @author: Thorn
 * @date: 2016/6/10.
 * @email: http://www.github.com/ostea
 */

public interface IloginModel {
    void login(String userName, String pswd, ILoginInterface iLoginInterface);
    void getUserInfo(String userName,String mToken);
}
