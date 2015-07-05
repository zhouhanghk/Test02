package com.examlpe.demo02.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.examlpe.demo02.R;

/**
 * Created by Zhou Hang on 2015/6/15.
 */
public class NewsDetailsActivity extends Activity implements View.OnClickListener {

    private TextView title;
    private TextView TextAbovePicture;
    private TextView TextBelowPicture;
    private ImageView NewsDetailImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_details_layout);

    }

    @Override
    public void onClick(View v) {

    }
}
