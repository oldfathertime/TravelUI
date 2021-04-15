package com.example.travelui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.example.travelui.fragment.IndexFragment;
import com.example.travelui.fragment.findFragement;
import com.example.travelui.fragment.meFragement;

public class MainActivity extends AppCompatActivity {

    protected findFragement findFragement = new findFragement();
    protected IndexFragment indexFragement = new IndexFragment();
    protected meFragement meFragement = new meFragement();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取管理类
        this.getSupportFragmentManager().beginTransaction()
                .add(R.id.container_content,indexFragement)
                .add(R.id.container_content,findFragement)
                .hide(findFragement)
                .add(R.id.container_content,meFragement)
                .hide(meFragement)
        //开启事务 默认：主页面 其他页面默认隐藏
        //提交事务
        .commit();
    }
}