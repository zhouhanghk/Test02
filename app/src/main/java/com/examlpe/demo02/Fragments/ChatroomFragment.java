package com.examlpe.demo02.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.examlpe.demo02.Activities.ChatActivity;
import com.examlpe.demo02.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhou Hang on 2015/6/9.
 */
public class ChatroomFragment extends Fragment implements AdapterView.OnItemClickListener{

    private GridView mGridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View chatroomLayout = inflater.inflate(R.layout.chatroom_layout,
                container, false);
        mGridView= (GridView) chatroomLayout.findViewById(R.id.chatroom_gridview);
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),getData(),R.layout.chatroom_item_layout,
                new String[]{"title","category","chatroom_image"},
                new int[]{R.id.chatroom_item_title,R.id.chatroom_item_category,R.id.chatroom_item_image});
        mGridView.setAdapter(adapter);
        mGridView.setOnItemClickListener(this);

        return chatroomLayout;
    }


    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        map.put("tiele", "Chatroom 1");
        map.put("category", "Category");
        map.put("chatroom_image", R.drawable.i1);
        list.add(map);

        return list;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(getActivity(),ChatActivity.class);
        startActivity(intent);
    }
}