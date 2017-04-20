package com.gdgvitvellore.pricecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private static final int NUM_LIST_ITEMS = 25;

    private RecyclerView mCommList;
    private CommRecAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCommList = (RecyclerView) findViewById(R.id.rv_commodity);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mCommList.setLayoutManager(layoutManager);

        mCommList.setHasFixedSize(true);

        mAdapter = new CommRecAdapter(NUM_LIST_ITEMS);

        mCommList.setAdapter(mAdapter);
    }
}
