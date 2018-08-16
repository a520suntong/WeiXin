package com.example.a18996.weixin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class ConnectList extends AppCompatActivity implements View.OnClickListener{
    private List<Connect> connectList=new ArrayList<>();
    private ImageView imageView1;
    private ImageView imageView2;
    private ImageView imageView3;
    private ImageView imageView4;
    private ImageView imageView5;
    private ImageView imageView6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect_layout);
        //隐藏标题栏
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        initconnect();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.connect_view);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        ConnectAdapter adapter=new ConnectAdapter(connectList);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));//添加分割线
        recyclerView.setAdapter(adapter);

        imageView1 = (ImageView) findViewById(R.id.weixin_bottom);
        imageView1.setOnClickListener(this);
        imageView2 = (ImageView) findViewById(R.id.tongxinlu_bottom);
        imageView2.setOnClickListener(this);
        imageView3 = (ImageView) findViewById(R.id.faxian_bottom);
        imageView3.setOnClickListener(this);
        imageView4 = (ImageView) findViewById(R.id.wo_bottom);
        imageView4.setOnClickListener(this);
        imageView5 = (ImageView) findViewById(R.id.sousuo);
        imageView5.setOnClickListener(this);
        imageView6 = (ImageView) findViewById(R.id.more);
        imageView6.setOnClickListener(this);

        imageView1.setImageResource(R.drawable.weixin);
        imageView2.setImageResource(R.drawable.tongxinlu1);
        imageView3.setImageResource(R.drawable.faxian);
        imageView4.setImageResource(R.drawable.wo);

    }

    @Override
    //切换界面
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.weixin_bottom:
                Intent intent1 = new Intent(ConnectList.this, MainActivity.class);
                startActivity(intent1);

                break;
            case R.id.faxian_bottom:
                Intent intent3 = new Intent(ConnectList.this, FoundActivity.class);
                startActivity(intent3);

                break;
            case R.id.wo_bottom:
                Intent intent4 = new Intent(ConnectList.this, MeActivity.class);
                startActivity(intent4);

                break;
            case R.id.sousuo:
                Toast.makeText(ConnectList.this, "搜索", Toast.LENGTH_SHORT).show();
                break;
            case R.id.more:
                Toast.makeText(ConnectList.this, "更多", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
    private void initconnect(){
        for (int i = 0; i < 1; i++) {
            Connect newFriend = new Connect(R.drawable.new_friend, "新的朋友");
            connectList.add(newFriend);
            Connect group = new Connect(R.drawable.group, "群聊");
            connectList.add(group);
            Connect tag = new Connect(R.drawable.tag, "标签");
            connectList.add(tag);
            Connect account = new Connect(R.drawable.accounts, "公众号");
            connectList.add(account);
            Connect qun=new Connect(R.drawable.qun,"\uD83C\uDF1C你si不si\uD83C\uDF1A\uD83C\uDF1E\uD83C\uDF1D傻的\uD83C\uDF1B");
            connectList.add(qun);
            Connect cyq=new  Connect(R.drawable.cyq,"陈尧权");
            connectList.add(cyq);
            Connect csm=new  Connect(R.drawable.csm,"陈世明");
            connectList.add(csm);
            Connect czk=new   Connect(R.drawable.czk,"陈志坤");
            connectList.add(czk);
            Connect whb=new  Connect(R.drawable.whb,"吴华博");
            connectList.add(whb);
            Connect jrj=new   Connect(R.drawable.jrq,"蒋润锦");
            connectList.add(jrj);
            Connect ckm=new   Connect(R.drawable.ckm,"陈康明");
            connectList.add(ckm);
            Connect zgh=new   Connect(R.drawable.zgh,"朱国浩");
            connectList.add(zgh);
            Connect lyj=new   Connect(R.drawable.lyj,"林榆均");
            connectList.add(lyj);
            Connect zl=new   Connect(R.drawable.zl,"郑磊");
            connectList.add(zl);
            Connect wyn=new   Connect(R.drawable.wyn,"王亚宁");
            connectList.add(wyn);
            Connect sj=new   Connect(R.drawable.ydk,"书记");
            connectList.add(sj);
            Connect czj=new  Connect(R.drawable.czj,"蔡梓杰");
            connectList.add(czj);
            Connect wxl=new   Connect(R.drawable.wxl,"魏小龙");
            connectList.add(wxl);
            Connect cjw=new   Connect(R.drawable.cjw,"陈嘉文");
            connectList.add(cjw);
            Connect jf=new   Connect(R.drawable.jf,"姐夫");
            connectList.add(jf);
        }
    }
}
