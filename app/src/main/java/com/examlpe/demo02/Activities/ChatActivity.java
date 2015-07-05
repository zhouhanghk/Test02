package com.examlpe.demo02.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.examlpe.demo02.ChattingListData;
import com.examlpe.demo02.ChattingTextAdapter;
import com.examlpe.demo02.HttpData;
import com.examlpe.demo02.HttpGetDataListener;
import com.examlpe.demo02.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhou Hang on 2015/6/11.
 */
public class ChatActivity extends Activity implements HttpGetDataListener,View.OnClickListener {

    private HttpData mHttpData;
    private List<ChattingListData> mList;
    private ListView mListView;
    private EditText sendText;
    private ImageButton sendButton;
    private String message_tobesent;
    private ChattingTextAdapter mChattingTextAdapter;
//    private RefreshableView mRefreshableView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatting_layout);
        initView();

    }

    @Override
    public void getDataUrl(String data) {
        // System.out.println(data);
        parseText(data);
    }

    public void parseText(String string){
        try {
            JSONObject jsonObject=new JSONObject(string);
            //Data Encapsulation
            ChattingListData mChattingListData1 =new ChattingListData(jsonObject.getString("text"),ChattingListData.RECEIVER);
            mList.add(mChattingListData1);
            mChattingTextAdapter.notifyDataSetChanged();
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }

    private void initView(){
        mList=new ArrayList<ChattingListData>();                       //Data Source
        mListView= (ListView) findViewById(R.id.chat_listview);      //ListView
//        mRefreshableView = (RefreshableView)findViewById(R.id.chatting_refreshable_view);
        sendButton= (ImageButton) findViewById(R.id.send_button);
        sendText= (EditText) findViewById(R.id.send_text);
        sendButton.setOnClickListener(this);
        mChattingTextAdapter=new ChattingTextAdapter(mList,this);      //Adapter
        mListView.setAdapter(mChattingTextAdapter);
//        mRefreshableView.setOnRefreshListener(new RefreshableView.PullToRefreshListener() {
//            @Override
//            public void onRefresh() {
//                try {
//                    Thread.sleep(1500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                mRefreshableView.finishRefreshing();
//            }
//        }, 0);
    }

    @Override
    public void onClick(View v) {
        message_tobesent=sendText.getText().toString();
        sendText.setText("");
        ChattingListData mChattingListData2;
        mChattingListData2= new ChattingListData(message_tobesent,ChattingListData.SENDER);
        mList.add(mChattingListData2);
        mChattingTextAdapter.notifyDataSetChanged();
        mHttpData= (HttpData) new HttpData("http://www.tuling123.com/openapi/api?key=027b72ec38c677358ab7a40ab0c86637&info="+message_tobesent, this).execute();
    }
}
