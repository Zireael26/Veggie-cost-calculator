package com.gdgvitvellore.pricecalculator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abhishek_cp on 4/20/2017.
 */

public class CommRecAdapter extends RecyclerView.Adapter<CommRecAdapter.CommodityViewHolder> {

    private ArrayList<Commodity> mListStuff;
    public CommRecAdapter(ArrayList<Commodity> listOfThings) {
        this.mListStuff = listOfThings;
    }

    @Override
    public CommodityViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachParentToImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachParentToImmediately);
        CommodityViewHolder viewHolder = new CommodityViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CommodityViewHolder holder, int position) {
        holder.rateTextView.setText("" + mListStuff.get(position).getRate());
        holder.qtyTextView.setText("" + mListStuff.get(position).getWeight());
        holder.priceTextView.setText("" + mListStuff.get(position).getCost());
        holder.nameTextView.setText("Cost of " + mListStuff.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return mListStuff.size();
    }


    public class CommodityViewHolder extends RecyclerView.ViewHolder {
        TextView rateTextView, qtyTextView, priceTextView, nameTextView;

        public CommodityViewHolder(View itemView){
            super(itemView);

            rateTextView = (TextView) itemView.findViewById(R.id.rateVal);
            qtyTextView = (TextView) itemView.findViewById(R.id.weightVal);
            priceTextView = (TextView) itemView.findViewById(R.id.costVal);
            nameTextView = (TextView) itemView.findViewById(R.id.nameOfVegetable);
        }

       /* void bind(int listIndex) {
            for(int i=0; i<getItemCount();i++) {
                rateTextView.setText("" + Commodity.getRate());
                qtyTextView.setText("" + Commodity.getWeight());
                priceTextView.setText("" + Commodity.getCost());
            }
        }*/
    }
}
