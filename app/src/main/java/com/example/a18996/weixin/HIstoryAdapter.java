package com.example.a18996.weixin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HIstoryAdapter extends ArrayAdapter<history> {
    private int resourceId;
    public HIstoryAdapter(Context context, int textViewResourceId, List<history> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        history his=getItem(position);
        View view;
        ViewHoler viewHoler;
        if (convertView==null){
         view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
         viewHoler=new ViewHoler();
         viewHoler.touxiang=(ImageView)view.findViewById(R.id.touxiang_image);
         viewHoler.bell=(ImageView)view.findViewById(R.id.bell_image);
         viewHoler.name=(TextView)view.findViewById(R.id.name);
         viewHoler.chat=(TextView)view.findViewById(R.id.chat_view);
         viewHoler.time=(TextView)view.findViewById(R.id.time_view);
         view.setTag(viewHoler);
        } else{
            view=convertView;
            viewHoler=(ViewHoler)view.getTag();
        }
        viewHoler.name.setText(his.getName());
        viewHoler.bell.setImageResource(his.getBellId());
        viewHoler.touxiang.setImageResource(his.getImageId());
        viewHoler.time.setText(his.getTime());
        viewHoler.chat.setText(his.getDialog());
        return view;
    }

    class ViewHoler {
        ImageView  touxiang;
        ImageView bell;
        TextView name;
        TextView chat;
        TextView time;
    }
}
