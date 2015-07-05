package com.examlpe.demo02;

import android.os.AsyncTask;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Zhou Hang on 2015/6/12.
 */
public class HttpData extends AsyncTask<String, Void, String>{

    private HttpClient mHttpClient;
    private HttpGet mHttpGet;
    private HttpResponse mHttpResponse;
    private HttpEntity mHttpEntity;
    private InputStream mInputStream;
    private HttpGetDataListener mHttpGetDataListener;
    private String url;

    public HttpData(String url,HttpGetDataListener mHttpGetDataListener){
        this.url=url;
        this.mHttpGetDataListener=mHttpGetDataListener;
    }
    @Override
    protected String doInBackground(String... params) {
        try {
//            mHttpClient=new DefaultHttpClient();
//            mHttpGet=new HttpGet(url);
//            mHttpResponse=mHttpClient.execute(mHttpGet);
//            mHttpEntity=mHttpResponse.getEntity();
//            mInputStream=mHttpEntity.getContent();
//            BufferedReader br=new BufferedReader(new InputStreamReader((mInputStream)));
//            String line=null;
//            StringBuffer sb=new StringBuffer();
//
//            while((line=br.readLine())!=null){
//                sb.append(line);
//            }
//            return sb.toString();

            URL getUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
            connection.connect();
            // 取得输入流，并使用Reader读取
            BufferedReader reader = new BufferedReader(new InputStreamReader( connection.getInputStream(), "utf-8"));
            StringBuffer sb = new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
            // 断开连接
            connection.disconnect();
            return sb.toString();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    protected void onPostExecute(String result){
        mHttpGetDataListener.getDataUrl(result);
        super.onPostExecute(result);
    }
}
