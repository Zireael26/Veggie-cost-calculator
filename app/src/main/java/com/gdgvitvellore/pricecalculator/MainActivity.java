package com.gdgvitvellore.pricecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<RatesModel> listOfCommodities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listOfCommodities.add(new RatesModel(R.drawable.apple,"Apple"));
        listOfCommodities.add(new RatesModel( R.drawable.avocado,"Avacado"));
        listOfCommodities.add(new RatesModel( R.drawable.banana,"Banana"));
        listOfCommodities.add(new RatesModel( R.drawable.carrot,"Carrot"));
        listOfCommodities.add(new RatesModel( R.drawable.lemon,"Lemon"));
        listOfCommodities.add(new RatesModel( R.drawable.broccoli,"Broccoli"));

//        mCommList = (RecyclerView) findViewById(R.id.rv_commodity);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        mCommList.setLayoutManager(layoutManager);
//
        RecyclerView mCommList = (RecyclerView) findViewById(R.id.rv_commodity);
        mCommList.setLayoutManager(new LinearLayoutManager(this));
        RatesActivityAdapter mAdapter = new RatesActivityAdapter(listOfCommodities);
        mCommList.setAdapter(mAdapter);
//
//        FloatingActionButton updateRates= (FloatingActionButton) findViewById(R.id.updateRate);
//        updateRates.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Itn
//            }
//        });
    }

}
