package com.gdgvitvellore.pricecalculator;

/**
 * Created by abhishek_cp on 4/10/2017.
 */

class Commodity {

    private String mName;
    private double mRate;
    private int mWeight;
    private double mCost;
    private int mImageResourceID;
    private int mCardColor;

    Commodity(String Name, double Rate, int imageResourceID, int cardColor) {

        this.mName = Name;
        this.mRate = Rate;
        this.mImageResourceID = imageResourceID;
        this.mCardColor = cardColor;

    }

    Commodity(String mName, double mRate, int mWeight) {
        this.mName = mName;
        this.mRate = mRate;
        this.mWeight = mWeight;
        this.mCost = ((mWeight * mRate) / 1000);
    }

    String getName() {
        return this.mName;
    }

    double getCost() {
        return this.mCost;
    }

    int getWeight() {
        return this.mWeight;
    }

    double getRate() {
        return this.mRate;
    }

    int getImageResourceID() {
        return this.mImageResourceID;
    }


    int getmCardColor() {
        return mCardColor;
    }

    public void setmName(String mName) {

        this.mName = mName;
    }

    public void setmRate(double mRate) {
        this.mRate = mRate;
    }

    public void setmWeight(int mWeight) {
        this.mWeight = mWeight;
    }

    public void setmCost(double mCost) {
        this.mCost = mCost;
    }

    public void setmImageResourceID(int mImageResourceID) {
        this.mImageResourceID = mImageResourceID;
    }
}
