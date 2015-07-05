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

import com.examlpe.demo02.Activities.ChatActivity;
import com.examlpe.demo02.R;
import com.examlpe.demo02.RefreshableView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Zhou Hang on 2015/6/9.
 */
public class ContactsFragment extends Fragment implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private RefreshableView mRefreshableView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contactsLayout = inflater.inflate(R.layout.contacts_layout,
                container, false);

        mListView = (ListView)contactsLayout.findViewById(R.id.contacts_listview);
        mRefreshableView = (RefreshableView) contactsLayout.findViewById(R.id.contacts_refreshable_view);
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),getData(),R.layout.contact_item_layout,
                new String[]{"name","lasttalk","contact_avatar"},
                new int[]{R.id.name,R.id.lasttalk,R.id.contact_avatar});
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(this);
        mListView.setOverScrollMode(View.OVER_SCROLL_ALWAYS);
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
        return contactsLayout;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(getActivity(),ChatActivity.class);
        startActivity(intent);
    }


    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "Contact 1");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i1);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 2");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i2);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 3");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i3);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 4");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i4);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 5");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i5);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 6");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i6);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 7");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i7);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 8");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i8);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 9");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i9);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 10");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i10);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 11");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i11);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("name", "Contact 12");
        map.put("lasttalk", "     whatever that is...");
        map.put("contact_avatar", R.drawable.i12);
        list.add(map);

        return list;
    }
}