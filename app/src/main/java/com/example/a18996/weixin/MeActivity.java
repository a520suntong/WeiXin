package com.example.a18996.weixin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MeActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private Context act_this=MeActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        //隐藏标题栏
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        imageView1=(ImageView)findViewById(R.id.weixin_bottom);
        imageView1.setOnClickListener(this);
        imageView2=(ImageView)findViewById(R.id.tongxinlu_bottom);
        imageView2.setOnClickListener(this);
        imageView3=(ImageView)findViewById(R.id.faxian_bottom);
        imageView3.setOnClickListener(this);
        imageView4=(ImageView)findViewById(R.id.wo_bottom);
        imageView4.setOnClickListener(this);
        imageView5=(ImageView)findViewById(R.id.sousuo);
        imageView5.setOnClickListener(this);
        imageView6=(ImageView)findViewById(R.id.more);
        imageView6.setOnClickListener(this);

        imageView1.setImageResource(R.drawable.weixin);
        imageView2.setImageResource(R.drawable.tongxinlu);
        imageView3.setImageResource(R.drawable.faxian);
        imageView4.setImageResource(R.drawable.wo1);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.weixin_bottom:
                Intent intent1=new Intent(act_this,MainActivity.class);
                startActivity(intent1);

                break;
            case R.id.tongxinlu_bottom:
                Intent intent2=new Intent(act_this,ConnectList.class);
                startActivity(intent2);

                break;
            case R.id.faxian_bottom:
                Intent intent3=new Intent(act_this,FoundActivity.class);
                startActivity(intent3);

                break;

            case R.id.sousuo:
                Toast.makeText(MeActivity.this,"搜索",Toast.LENGTH_SHORT).show();
                break;
            case R.id.more:
                Toast.makeText(MeActivity.this,"更多", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
