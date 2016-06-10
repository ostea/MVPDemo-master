package com.medlighter.thorn.mvpdemo.prestener;

import android.os.Handler;

import com.medlighter.thorn.mvpdemo.intef.ILoginInterface;
import com.medlighter.thorn.mvpdemo.model.IloginModel;
import com.medlighter.thorn.mvpdemo.model.LoginModelImp;
import com.medlighter.thorn.mvpdemo.bean.User;
import com.medlighter.thorn.mvpdemo.view.ILoginView;

/**
 * @author: Thorn
 * @date: 2016/6/10.
 * @email: http://www.github.com/ostea
 */
public class LoginPresenterImp implements IloginPresenter{
    IloginModel miloginModel;
    ILoginView miLoginView;
    private Handler mHandler=new Handler();

    public LoginPresenterImp(ILoginView miLoginView) {
        this.miloginModel = new LoginModelImp();
        this.miLoginView = miLoginView;
    }

    @Override
    public void login() {
        miLoginView.showPb();
        miloginModel.login(miLoginView.getUsername(), miLoginView.getPassword(), new ILoginInterface() {
            @Override
            public void loginSuccess(final User user) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        miLoginView.loginSuccess(user);
                        miLoginView.hidePb();
                    }
                });
            }
            @Override
            public void loginFail() {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        miLoginView.showLoginFail();
                        miLoginView.hidePb();
                    }
                });
            }
        });
    }
    @Override
    public void clear() {
        miLoginView.clearUsername();
        miLoginView.clearPswd();
    }
}
