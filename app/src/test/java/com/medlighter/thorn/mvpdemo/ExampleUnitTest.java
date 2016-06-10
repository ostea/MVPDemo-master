package com.medlighter.thorn.mvpdemo;

import android.util.Log;

import com.medlighter.thorn.mvpdemo.bean.User;
import com.medlighter.thorn.mvpdemo.intef.ILoginInterface;
import com.medlighter.thorn.mvpdemo.model.IloginModel;
import com.medlighter.thorn.mvpdemo.model.LoginModelImp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void doLogin_isSuccess() throws  Exception{
        //这里对model对一些单元测试
        IloginModel model=new LoginModelImp();

        model.login("123", "234", new ILoginInterface() {
            @Override
            public void loginSuccess(User user) {
                Log.i("TAG",user.getUserName());
            }

            @Override
            public void loginFail() {
                Log.i("TAG","fail");
            }
        });
    }
}