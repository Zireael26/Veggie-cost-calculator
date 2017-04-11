package com.gdgvitvellore.pricecalculator;

/**
 * Created by abhishek_cp on 4/10/2017.
 */

public class Commodity {

    private  String mName;
    private double mRate;
    private int mWeight;
    private double mPrice;

    public Commodity(String Name, double Rate, int Weight) {

        this.mName = Name;
        this.mRate = Rate;
        this.mWeight = Weight;
        this.mPrice = ((mWeight / 1000) * mRate);
    }

    public String getName() {
        return mName;
    }

    public double getPrice() {
        return mPrice;
    }

    public int getWeight() {
        return mWeight;
    }

    public double getRate() {
        return mRate;
    }

}
