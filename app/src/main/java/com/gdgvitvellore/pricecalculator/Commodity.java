package com.gdgvitvellore.pricecalculator;

/**
 * Created by abhishek_cp on 4/10/2017.
 */

public class Commodity {

    private String mName;
    private double mRate;
    private int mWeight;
    private double mCost;

    public Commodity(String Name, double Rate, int Weight) {

        this.mName = Name;
        this.mRate = Rate;
        this.mWeight = Weight;
        this.mCost = ((Weight * Rate)/1000);
    }

    public String getName() {
        return this.mName;
    }

    public double getCost() {
        return this.mCost;
    }

    public int getWeight() {
        return this.mWeight;
    }

    public double getRate() {
        return this.mRate;
    }

}
