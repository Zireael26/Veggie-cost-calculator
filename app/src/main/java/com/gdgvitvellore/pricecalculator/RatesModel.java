package com.gdgvitvellore.pricecalculator;

/**
 * Created by shubham on 30/4/17.
 * And improved by vulfpeck on 15/10/18
 */

public class RatesModel {

    private int rateToday;
    private int rateImage;

    public String getRateNAme() {
        return rateNAme;
    }

    public void setRateNAme(String rateNAme) {
        this.rateNAme = rateNAme;
    }

    private String rateNAme;

    public int getRateToday() {
        return rateToday;
    }

    public void setRateToday(int rateToday) {
        this.rateToday = rateToday;
    }

    public int getRateImage() {
        return rateImage;
    }

    public void setRateImage(int rateImage) {
        this.rateImage = rateImage;
    }

    public String getRateVegName() {
        return rateVegName;
    }

    public void setRateVegName(String rateVegName) {
        this.rateVegName = rateVegName;
    }

    private String rateVegName;

    public RatesModel(int rateImage, String rateVegName) {
        this.rateImage = rateImage;
        this.rateVegName = rateVegName;
    }
}
