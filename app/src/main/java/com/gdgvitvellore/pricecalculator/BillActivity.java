package com.gdgvitvellore.pricecalculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by shubham on 1/5/17.
 */

public class BillActivity extends AppCompatActivity{
    ArrayList<BillModel> bills=new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill_layout);
        //TODO fetch data from firebase
        bills.add(new BillModel("Aloo","43","34","569",R.drawable.apple));
        bills.add(new BillModel("puaz","413","334","4569",R.drawable.banana));
        bills.add(new BillModel("puaz","4131","2334","44569",R.drawable.cherry));
        RecyclerView mCommList = (RecyclerView) findViewById(R.id.rv_bills);
        mCommList.setLayoutManager(new LinearLayoutManager(this));
        BillAdapter mAdapter = new BillAdapter(bills);
        mCommList.setAdapter(mAdapter);
    }


}
