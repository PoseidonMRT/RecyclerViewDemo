package com.tt.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerViewAdapter mRecyclerViewAdapter;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    public void initView(){
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        mRecyclerViewAdapter = new RecyclerViewAdapter(this);
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
    }

    public void initData(){
        mRecyclerView.setAdapter(mRecyclerViewAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
    }
}
