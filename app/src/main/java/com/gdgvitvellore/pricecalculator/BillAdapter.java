package com.gdgvitvellore.pricecalculator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shubham on 1/5/17.
 */

public class BillAdapter extends RecyclerView.Adapter<BillAdapter.BillViewHolder>{
    private ArrayList<BillModel> mListStuff;

    public BillAdapter(ArrayList<BillModel> mListStuff) {
        this.mListStuff = mListStuff;
    }

    @Override
    public BillViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.bill_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachParentToImmediately = false;
        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachParentToImmediately);
        BillViewHolder viewHolder = new BillViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BillAdapter.BillViewHolder holder, int position) {
        holder.bname.setText(""+mListStuff.get(position).getBillName());
        holder.bweight.setText(""+mListStuff.get(position).getBillWeight());
        holder.brate.setText(""+mListStuff.get(position).getBillRate());
        holder.bamt.setText(""+mListStuff.get(position).getBillAmount());
        holder.bimg.setImageResource(mListStuff.get(position).getImageid());

    }

    @Override
    public int getItemCount() {
        return mListStuff.size();
    }

    public class BillViewHolder extends RecyclerView.ViewHolder{
        TextView bname,bweight,brate,bamt;
        ImageView bimg;

        public BillViewHolder(View itemView) {
            super(itemView);
            bname= (TextView) itemView.findViewById(R.id.bill_name);
            bweight= (TextView) itemView.findViewById(R.id.bill_weight);
            brate= (TextView) itemView.findViewById(R.id.bill_rate);
            bamt= (TextView) itemView.findViewById(R.id.bill_amt);
            bimg= (ImageView) itemView.findViewById(R.id.bill_image);

            //TODO to add Swipe remove Items and add FAb linked to PayTM Api
            /*Add swipe remove items
            * add a Fab to pay and link to the payTM api
            *
            * */
        }
    }
}
