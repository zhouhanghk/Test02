package com.examlpe.demo02.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.examlpe.demo02.R;

/**
 * Created by Zhou Hang on 2015/6/9.
 */
public class MeFragment extends Fragment implements View.OnClickListener {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View meLayout = inflater.inflate(R.layout.me_layout,
                container, false);

        return meLayout;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity().getApplicationContext(), "默认Toast样式",
                Toast.LENGTH_SHORT).show();
    }
}