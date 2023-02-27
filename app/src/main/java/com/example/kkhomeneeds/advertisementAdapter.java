package com.example.kkhomeneeds;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class advertisementAdapter extends RecyclerView.Adapter<advertisementAdapter.MyView> {

    private List<Integer> listImg;
    private int item_id;
    public class MyView extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyView(View view)
        {
            super(view);
            imageView = (ImageView)view.findViewById(R.id.advertise_img);
        }
    }
    public advertisementAdapter(List<Integer> horizontalImage, int id) {

        this.listImg = horizontalImage;
        this.item_id = id;
    }


    @Override
    public MyView onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(item_id, parent, false);
        return new MyView(itemView);
    }


    @Override
    public void onBindViewHolder(final MyView holder, final int position) {
        holder.imageView.setImageResource(listImg.get(position));
    }

    @Override
    public int getItemCount() {
        return listImg.size();
    }

}
