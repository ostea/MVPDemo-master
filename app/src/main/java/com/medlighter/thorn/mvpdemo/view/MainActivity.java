package com.medlighter.thorn.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.medlighter.thorn.mvpdemo.R;
import com.medlighter.thorn.mvpdemo.bean.User;
import com.medlighter.thorn.mvpdemo.prestener.IloginPresenter;
import com.medlighter.thorn.mvpdemo.prestener.LoginPresenterImp;

public class MainActivity extends AppCompatActivity implements ILoginView, View.OnClickListener {
    EditText etUsername, etPssword;
    Button btn_login;

    IloginPresenter mPresenter = new LoginPresenterImp( this);;

    ProgressBar mProgressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvp_main);
        initView();
    }

    private void initView() {
        etUsername = (EditText) this.findViewById(R.id.et_username);
        etPssword = (EditText) this.findViewById(R.id.et_pswd);
        btn_login = (Button) this.findViewById(R.id.btn_Login);
        mProgressBar= (ProgressBar) this.findViewById(R.id.progressbar);
        btn_login.setOnClickListener(this);
    }

    @Override
    public String getUsername() {
        return etUsername.getText().toString().trim();
    }

    @Override
    public String getPassword() {
        return etPssword.getText().toString();
    }

    @Override
    public void showPb() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hidePb() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void loginSuccess(User user) {
        Toast.makeText(MainActivity.this, "登陆成功...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoginFail() {
        Toast.makeText(MainActivity.this, "登陆失败...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clearUsername() {
        etUsername.setText("");
    }

    @Override
    public void clearPswd() {
        etPssword.setText("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_Login:
                mPresenter.login();
                break;
        }
    }
}
