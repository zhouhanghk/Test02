package com.examlpe.demo02.Fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.examlpe.demo02.Activities.NewsDetailsActivity;
import com.examlpe.demo02.R;
import com.examlpe.demo02.RefreshableView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhou Hang on 2015/6/9.
 */
public class NewsFragment extends Fragment implements AdapterView.OnItemClickListener{

    private ListView mListView;
    private RefreshableView mRefreshableView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View newsLayout = inflater.inflate(R.layout.news_layout,
                container, false);
        mListView = (ListView)newsLayout.findViewById(R.id.news_listview);
        mRefreshableView = (RefreshableView) newsLayout.findViewById(R.id.news_refreshable_view);
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),getData(),R.layout.news_item_layout,
                new String[]{"image","title","source","category","comment_count","publish_time"},
                new int[]{R.id.right_image,R.id.item_title,R.id.item_source,R.id.list_item_category,R.id.comment_count,R.id.publish_time});
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(this);
        mRefreshableView.setOnRefreshListener(new RefreshableView.PullToRefreshListener() {
            @Override
            public void onRefresh() {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mRefreshableView.finishRefreshing();
            }
        }, 0);

    return newsLayout;
    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        map.put("image", R.drawable.testimg);
        map.put("title", "启动看海模式 上海暴雨近百条路暴雨及膝");
        map.put("source", "手机人民网");
        map.put("category", "新闻");
        map.put("comment_count", "评论198");
        map.put("publish_time", "9:30");
        list.add(map);

        return list;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(getActivity(), NewsDetailsActivity.class);
        startActivity(intent);
    }
}

