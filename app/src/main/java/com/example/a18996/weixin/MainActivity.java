package com.example.a18996.weixin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.readystatesoftware.systembartint.SystemBarTintManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private List<history> historyList=new ArrayList<>();
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //隐藏标题栏
        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.hide();
        }
        initChat();
        HIstoryAdapter adapter=new HIstoryAdapter(MainActivity.this,R.layout.history_item,historyList);
        ListView listView=(ListView)findViewById(R.id.list_view);
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
        listView.setAdapter(adapter);
        imageView1.setImageResource(R.drawable.weixin1);
        imageView2.setImageResource(R.drawable.tongxinlu);
        imageView3.setImageResource(R.drawable.faxian);
        imageView4.setImageResource(R.drawable.wo);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.tongxinlu_bottom:
                Intent intent2 = new Intent(MainActivity.this, ConnectList.class);
                startActivity(intent2);

                break;
            case R.id.faxian_bottom:
                Intent intent3 = new Intent(MainActivity.this, FoundActivity.class);
                startActivity(intent3);

                break;
            case R.id.wo_bottom:
                Intent intent4 = new Intent(MainActivity.this, MeActivity.class);
                startActivity(intent4);

                break;
            case R.id.sousuo:
                Toast.makeText(MainActivity.this, "搜索", Toast.LENGTH_SHORT).show();
                break;
            case R.id.more:
                Toast.makeText(MainActivity.this, "更多", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
    private void initChat(){
        for (int i=0;i<1;i++){
            history qun=new history(R.drawable.qun,"\uD83C\uDF1C你si不si\uD83C\uDF1A\uD83C\uDF1E\uD83C\uDF1D傻的\uD83C\uDF1B",R.drawable.bell,"11:26","学习");
            historyList.add(qun);
            history sport=new history(R.drawable.sport,"微信运动",R.drawable.bell,"昨天","[应用消息]");
            historyList.add(sport);
            history cyq=new history(R.drawable.cyq,"陈尧权",0,"昨天","[动画表情]");
            historyList.add(cyq);
            history csm=new history(R.drawable.csm,"陈世明",0,"周四","[小程序]组队吃鸡！今晚一起大吉大利，就等你");
            historyList.add(csm);
            history czk=new history(R.drawable.czk,"陈志坤",0,"周四","[应用消息]");
            historyList.add(czk);
            history whb=new history(R.drawable.whb,"吴华博",0,"周二","哈哈哈");
            historyList.add(whb);
            history jrj=new history(R.drawable.jrq,"蒋润锦",0,"7月28日","嗯");
            historyList.add(jrj);
            history ckm=new history(R.drawable.ckm,"陈康明",0,"7月24日","还没需要用到学来也没用");
            historyList.add(ckm);
            history zgh=new history(R.drawable.zgh,"朱国浩",0,"7月22日","[动画表情]");
            historyList.add(zgh);
            history lyj=new history(R.drawable.lyj,"林榆均",0,"7月19日","[应用消息]");
            historyList.add(lyj);
            history zl=new history(R.drawable.zl,"郑磊",0,"7月16日","[哦]");
            historyList.add(zl);
            history wyn=new history(R.drawable.wyn,"王亚宁",0,"7月16日","嗯");
            historyList.add(wyn);
            history sj=new history(R.drawable.ydk,"书记",0,"7月16日","哦");
            historyList.add(sj);
            history czj=new history(R.drawable.czj,"蔡梓杰",0,"7月14日","你已添加了\"菜籽\"jie,现在可以开始聊天了。");
            historyList.add(czj);
            history wxl=new history(R.drawable.wxl,"魏小龙",0,"7月13日","魏小龙向你推荐了代网络通识选修课");
            historyList.add(wxl);
            history cjw=new history(R.drawable.cjw,"陈嘉文",0,"7月13日","[动画表情]");
            historyList.add(cjw);
            history jf=new history(R.drawable.jf,"姐夫",0,"7月10日","好的");
            historyList.add(jf);

        }
    }
}

