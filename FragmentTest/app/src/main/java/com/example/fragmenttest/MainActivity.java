package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
        replaceFragment(new RightFragment());
    }
    //点击事件
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                replaceFragment(new AnotherRightFragment());
                break;
                default:
                    break;
        }
    }
    private void replaceFragment (Fragment fragment){
        /*FragmentManager fragmentManager = getSupportFragmentManager(); //获取碎片
        FragmentTransaction transaction = fragmentManager.beginTransaction();  //开启事务
        transaction.replace(R.id.right_layout,fragment);   //替换事务
        transaction.addToBackStack(null); //退到上一个栈
        transaction.commit();  //提交事务*/
    }
}
