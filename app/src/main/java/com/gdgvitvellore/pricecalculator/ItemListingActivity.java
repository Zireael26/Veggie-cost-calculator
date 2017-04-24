package com.gdgvitvellore.pricecalculator;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ItemListingActivity extends AppCompatActivity {

    ArrayList<Commodity> list1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_listing);
        int defCol = Color.parseColor("#F44336");

        list1.add(new Commodity("Tomato", 15, R.drawable.tomato, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.tomato)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Potato", 10, R.drawable.potato, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.potato)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Bell Pepper Yellow", 40, R.drawable.bell_pepper, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.bell_pepper)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Brinjal", 23, R.drawable.aubergine, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.aubergine)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Broccoli", 6, R.drawable.broccoli, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.broccoli)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Apple", 100, R.drawable.apple, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.apple)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Lemon", 100, R.drawable.lemon, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.lemon)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Pumpkin", 15, R.drawable.pumpkin, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.pumpkin)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Beetroot", 15, R.drawable.beetroot, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.beetroot)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Avocado", 15, R.drawable.avocado, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.avocado)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Grape", 100, R.drawable.grape, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.grape)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Bell Pepper Red", 40, R.drawable.bell_pepper_1, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.bell_pepper_1)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Cherry", 90, R.drawable.cherry, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.cherry)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Chilli", 90, R.drawable.chili, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.chili)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Strawberry", 100, R.drawable.strawberry, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.strawberry)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Orange", 35, R.drawable.orange, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.orange)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Banana", 15, R.drawable.banana, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.banana)).generate().getVibrantColor(defCol)));
        list1.add(new Commodity("Cucumber", 10, R.drawable.cucumber, new Palette.Builder(
                BitmapFactory.decodeResource(getResources(), R.drawable.cucumber)).generate().getVibrantColor(defCol)));


        RecyclerView mCommList = (RecyclerView) findViewById(R.id.rv_shoplist);

        mCommList.setLayoutManager(new GridLayoutManager(this, 2));
        ShoplistAdapter mAdapter = new ShoplistAdapter(list1);
        mCommList.setAdapter(mAdapter);

    }


}
