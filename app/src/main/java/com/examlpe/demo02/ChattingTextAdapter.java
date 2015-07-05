package com.examlpe.demo02;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Zhou Hang on 2015/6/12.
 */
public class ChattingTextAdapter extends BaseAdapter {

    private List<ChattingListData> mChattingListDatas;
    private Context mContext;
    private RelativeLayout mLayout;

    public ChattingTextAdapter(List<ChattingListData> mChattingListData ,Context mContext){
        this.mChattingListDatas=mChattingListData;
        this.mContext=mContext;
    }

    @Override
    public int getCount() {
        return mChattingListDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mChattingListDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        if(mChattingListDatas.get(position).getFlag()==ChattingListData.RECEIVER){
            mLayout= (RelativeLayout) layoutInflater.inflate(R.layout.chatting_leftmessage,null);
        }
        if(mChattingListDatas.get(position).getFlag()==ChattingListData.SENDER){
            mLayout= (RelativeLayout) layoutInflater.inflate(R.layout.chatting_rightmessage,null);
        }
        //暂时使用固定头像

        TextView textView= (TextView) mLayout.findViewById(R.id.chatting_message);
        textView.setText(mChattingListDatas.get(position).getContent());
        return mLayout;
    }
}
