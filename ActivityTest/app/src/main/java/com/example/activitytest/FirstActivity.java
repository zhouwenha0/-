package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import java.net.URL;

public class FirstActivity extends BaseActivity {
    //创建菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    //菜单项，菜单相应事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked remove", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //声明
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                if (resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
                default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("FirstActivity" ,"Task id is" + getTaskId());
        setContentView(R.layout.first_layout);
        Button button1 =  findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            //按钮监听器
            @Override
            public void onClick(View view) {
                //隐示intent，启动第二个活动
               /* Intent intent = new Intent("com.example.activitytest.ACTION_START");
                intent.addCategory("com.example.activitytest.MY_CATEGORY");
                startActivity(intent); */
                //显示intent，启动第二个活动
                /* Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent); */
                //点击事件
                /* Toast.makeText(FirstActivity.this, "You Clicked Button 1",
                        Toast.LENGTH_SHORT).show();
                        startActivity(intent); */
                // finish();  结束活动
                //展示浏览器
                /* Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent); */
                //调用系统拨号界面
                /* Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent); */
                //将字符串传递到第二个界面里
                /* String data ="Hello SecondActivity";
                Intent intent =new Intent(FirstActivity.this,SecondActivity.class);
                intent.putExtra("extra_data",data);
                startActivity(intent); */
                //传递数据之后返回
                Intent intent =new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
