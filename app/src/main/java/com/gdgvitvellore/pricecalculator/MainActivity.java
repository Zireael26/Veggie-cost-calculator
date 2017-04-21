package com.gdgvitvellore.pricecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Commodity> listOfCommodities = new ArrayList<>();

    private RecyclerView mCommList;
    private CommRecAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listOfCommodities.add(new Commodity("Tomato", 15, 700));
        listOfCommodities.add(new Commodity("Potato", 10, 967));
        listOfCommodities.add(new Commodity("Cabbage", 12.5, 1260));
        listOfCommodities.add(new Commodity("Brinjal", 23, 650));
        listOfCommodities.add(new Commodity("Cauliflower", 6, 1763));
        listOfCommodities.add(new Commodity("Tomato", 15, 700));
        listOfCommodities.add(new Commodity("Tomato", 15, 700));
        listOfCommodities.add(new Commodity("Tomato", 15, 700));
        listOfCommodities.add(new Commodity("Tomato", 15, 700));

        mCommList = (RecyclerView) findViewById(R.id.rv_commodity);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mCommList.setLayoutManager(layoutManager);

        mCommList.setHasFixedSize(true);

        mAdapter = new CommRecAdapter(listOfCommodities);

        mCommList.setAdapter(mAdapter);
    }
}
