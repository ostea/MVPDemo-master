package com.medlighter.thorn.mvpdemo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.MediumTest;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.medlighter.thorn.mvpdemo.bean.User;
import com.medlighter.thorn.mvpdemo.intef.ILoginInterface;
import com.medlighter.thorn.mvpdemo.model.IloginModel;
import com.medlighter.thorn.mvpdemo.model.LoginModelImp;
import com.medlighter.thorn.mvpdemo.view.ILoginView;

import org.junit.Test;
import org.junit.runner.RunWith;


import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@MediumTest
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentationTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.medlighter.thorn.mvpdemo", appContext.getPackageName());
    }
    @Test
    public void doLogin_isSuccess() throws  Exception{
        //这里对model对一些单元测试
        IloginModel model=new LoginModelImp();
    }
}