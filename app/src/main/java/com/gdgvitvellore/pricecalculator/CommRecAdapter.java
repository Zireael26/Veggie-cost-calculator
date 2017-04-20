package com.gdgvitvellore.pricecalculator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by abhishek_cp on 4/20/2017.
 */

public class CommRecAdapter extends RecyclerView.Adapter<CommRecAdapter.CommodityViewHolder> {

    private int mNumberItems;

    public CommRecAdapter(int numberOfItems) {
        this.mNumberItems = numberOfItems;
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
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    public class CommodityViewHolder extends RecyclerView.ViewHolder {
        TextView rateTextView, qtyTextView, priceTextView;

        public CommodityViewHolder(View itemView){
            super(itemView);

            rateTextView = (TextView) itemView.findViewById(R.id.rateVal);
            qtyTextView = (TextView) itemView.findViewById(R.id.weightVal);
            priceTextView = (TextView) itemView.findViewById(R.id.costVal);
        }

        void bind(int listIndex) {
            rateTextView.setText("" + Commodity.getRate());
            qtyTextView.setText("" + Commodity.getWeight());
            priceTextView.setText("" + Commodity.getCost());
        }
    }
}
