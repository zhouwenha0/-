package com.example.guangbotest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private IntentFilter intentFilter;
    // private XinHaoJeiShou xinHaoJeiShou;
    private BenDiJieShou benDiJieShou;
    private BenDiGuangBo benDiGuangBo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        benDiGuangBo = BenDiGuangBo.getInstance(this); //获取实例
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               // Toast.makeText(view.getContext(),"123",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent("com.example.broadcasttest.MY_BROADCAST");
               // sendOrderedBroadcast(intent,null);
                benDiGuangBo.sendBroadcast(intent);//发送本地广播
            }
        });
        intentFilter =new IntentFilter();
        intentFilter.addAction("com.example.broadcasttest.MY_BROADCAST");
        benDiJieShou =new BenDiJieShou();
       // benDiGuangBo.registerReceiver();//注册本地广播监听器
        // xinHaoJeiShou =new XinHaoJeiShou();
        // registerReceiver(xinHaoJeiShou,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        benDiGuangBo.unregisterReceiver(benDiJieShou);
    }
   /* class XinHaoJeiShou extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectionManager=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectionManager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isAvailable()){
                Toast.makeText(context,"有网",Toast.LENGTH_SHORT).show(); //当信号改变时，提示
            }else{
                Toast.makeText(context,"没网",Toast.LENGTH_SHORT).show(); //当信号改变时，提示
            }
        }
    }*/
}
