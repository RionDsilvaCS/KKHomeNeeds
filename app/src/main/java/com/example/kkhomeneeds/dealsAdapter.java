package com.example.kkhomeneeds;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class dealsAdapter extends RecyclerView.Adapter<dealsAdapter.MyView> {

    private List<Integer> listImg;
    private List<String> listName, listCategory, listPrice, listOffer;
    private int item_id;
    public class MyView extends RecyclerView.ViewHolder {

        ImageView itemImg;
        TextView itemName, itemCategory, itemPrice, itemOffer;

        public MyView(View view)
        {
            super(view);
            itemImg = (ImageView)view.findViewById(R.id.product_img);
            itemName = (TextView) view.findViewById(R.id.product_name);
            itemCategory = (TextView) view.findViewById(R.id.product_category);
            itemPrice= (TextView) view.findViewById(R.id.product_price);
            itemOffer = (TextView) view.findViewById(R.id.product_offer);
        }
    }
    public dealsAdapter(List<Integer> horizontalImage,List<String> name, List<String> category, List<String> price, List<String> offer, int id) {
        this.listImg = horizontalImage;
        this.listName = name;
        this.listCategory = category;
        this.listPrice = price;
        this.listOffer = offer;
        this.item_id = id;
    }

    @Override
    public MyView onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(item_id, parent, false);
        return new MyView(itemView);
    }

    @Override
    public void onBindViewHolder(final MyView holder, final int position) {
        holder.itemImg.setImageResource(listImg.get(position));
        holder.itemName.setText(listName.get(position));
        holder.itemCategory.setText(listCategory.get(position));
        holder.itemPrice.setText(listPrice.get(position));
        holder.itemOffer.setText(listOffer.get(position));
    }

    @Override
    public int getItemCount() {
        return listImg.size();
    }

}

