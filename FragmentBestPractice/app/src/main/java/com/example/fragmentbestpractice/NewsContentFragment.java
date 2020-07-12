package com.example.fragmentbestpractice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class NewsContentFragment extends Fragment {
    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.news_buju,container,false);
        return view;
    }
    //将新闻的标题和内容显示在界面上
    public void refresh(String newsTitle ,String newsContent){
        View visibilityLayout = view.findViewById(R.id.buju_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleText = view.findViewById(R.id.news_title);
        TextView newsContentText = view.findViewById(R.id.news_content);
        newsTitleText.setText(newsTitle); //刷新新闻标题
        newsContentText.setText(newsContent);//刷新新闻内容
    }
}
