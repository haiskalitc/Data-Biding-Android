package com.example.cscom_pc.baitap;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cscom_pc.baitap.databinding.DemobidingBinding;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DemobidingBinding demobidingBinding = DataBindingUtil.setContentView(this,R.layout.demobiding);
        DemoDataBinding data = new DemoDataBinding(
                "Nhập tài khoàn ",
                "Nhập mật khẩu",
                "Quên mật khẩu",
                "ĐĂNG NHẬP"
                );
        demobidingBinding.setDemo(data);
    }
}
