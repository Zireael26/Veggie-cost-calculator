package com.gdgvitvellore.pricecalculator;

/**
 * Created by abhishek_cp on 4/10/2017.
 */

public class Commodity {

    private  String mName;
    private static double mRate;
    private static int mWeight;
    private static double mCost;

    public Commodity(String Name, double Rate, int Weight) {

        this.mName = Name;
        this.mRate = Rate;
        this.mWeight = Weight;
        this.mCost = ((mWeight / 1000) * mRate);
    }

    public String getName() {
        return mName;
    }

    public static double getCost() {
        return mCost;
    }

    public static int getWeight() {
        return mWeight;
    }

    public static double getRate() {
        return mRate;
    }

}
