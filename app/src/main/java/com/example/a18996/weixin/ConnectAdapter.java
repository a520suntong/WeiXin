package com.example.a18996.weixin;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class ConnectAdapter extends RecyclerView.Adapter<ConnectAdapter.ViewHolder> {
    private List<Connect> mConnectList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView connectImage;
        TextView connectName;
        public ViewHolder(View view){
            super(view);
            connectImage=(ImageView)view.findViewById(R.id.connect_image);
            connectName=(TextView)view.findViewById(R.id.connect_name);
        }
    }
    public ConnectAdapter(List<Connect> ConnectList){
        mConnectList=ConnectList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.connect_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Connect connect=mConnectList.get(position);
        holder.connectImage.setImageResource(connect.getImageId());
        holder.connectName.setText(connect.getName());
    }

    @Override
    public int getItemCount() {
        return mConnectList.size();
    }
}
