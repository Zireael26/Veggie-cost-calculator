package com.gdgvitvellore.pricecalculator;

/**
 * Created by shubham on 1/5/17.
 */

public class BillModel {
    private String billName;
    private String billRate;
    private String billAmount;
    private String billWeight;
    private int imageid;

    public BillModel(String billName, String billRate, String billAmount, String billWeight, int imageid) {
        this.billName = billName;
        this.billRate = billRate;
        this.billAmount = billAmount;
        this.billWeight = billWeight;
        this.imageid = imageid;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBillRate() {
        return billRate;
    }

    public void setBillRate(String billRate) {
        this.billRate = billRate;
    }

    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }

    public String getBillWeight() {
        return billWeight;
    }

    public void setBillWeight(String billWeight) {
        this.billWeight = billWeight;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

}
