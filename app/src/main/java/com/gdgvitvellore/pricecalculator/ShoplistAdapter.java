package com.gdgvitvellore.pricecalculator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by abhishek_cp on 4/24/2017.
 */

public class ShoplistAdapter extends RecyclerView.Adapter<ShoplistAdapter.CInputViewHolder> {

    private ArrayList<Commodity> mListStuff;


    public ShoplistAdapter(ArrayList<Commodity> listOfCommodities) {
        this.mListStuff = listOfCommodities;
    }

    @Override
    public CInputViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.list_item_layout_2;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachParentToImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachParentToImmediately);
        CInputViewHolder viewHolder = new CInputViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CInputViewHolder holder, int position) {
        holder.rate_tv.setText("" + mListStuff.get(position).getRate());
        holder.name_tv.setText("" + mListStuff.get(position).getName());
        holder.imageView.setImageResource(mListStuff.get(position).getImageResourceID());
        holder.linearLayout.setBackgroundColor(mListStuff.get(position).getmCardColor());
        holder.imageButton.setBackgroundColor(mListStuff.get(position).getmCardColor());

    }

    @Override
    public int getItemCount() {
        return mListStuff.size();
    }


    public class CInputViewHolder extends RecyclerView.ViewHolder {
        TextView rate_tv, name_tv;
        LinearLayout linearLayout;
        ImageView imageView;
        ImageButton imageButton;

        public CInputViewHolder(View itemView) {
            super(itemView);

            rate_tv = (TextView) itemView.findViewById(R.id.rate_tv);
            name_tv = (TextView) itemView.findViewById(R.id.name_tv);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.colorThis);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            imageButton = (ImageButton) itemView.findViewById(R.id.addButton);
        }
    }
}
