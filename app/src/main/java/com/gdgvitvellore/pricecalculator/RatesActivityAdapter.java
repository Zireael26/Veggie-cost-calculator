package com.gdgvitvellore.pricecalculator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shubham on 30/4/17.
 */

public class RatesActivityAdapter extends RecyclerView.Adapter<RatesActivityAdapter.RatesCardViewHolder>{

    private ArrayList<RatesModel>  ratesToday;

    public RatesActivityAdapter(ArrayList<RatesModel> ratesToday) {
        this.ratesToday = ratesToday;
    }
    @Override
    public RatesCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachParentToImmediately = false;
        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachParentToImmediately);
        RatesCardViewHolder viewHolder = new RatesCardViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(RatesCardViewHolder holder, int position) {
        holder.vegName.setText(""+ratesToday.get(position).getRateVegName());
        holder.vegImage.setImageResource(ratesToday.get(position).getRateImage());
        holder.todayRate.setText(""+ratesToday.get(position).getRateToday());
    }
    @Override
    public int getItemCount() {
        return ratesToday.size();
    }

    public  class RatesCardViewHolder extends RecyclerView.ViewHolder{
        EditText todayRate;
        TextView vegName;
        ImageView vegImage;
        public RatesCardViewHolder(View itemView) {
            super(itemView);
            todayRate= (EditText) itemView.findViewById(R.id.rate_today);
            vegName= (TextView) itemView.findViewById(R.id.rate_vegname);
            vegImage= (ImageView) itemView.findViewById(R.id.rate_img);
        }

    }
}
