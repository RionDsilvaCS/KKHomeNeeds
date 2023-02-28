package com.example.kkhomeneeds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SearchResultActivity extends AppCompatActivity {

    private RecyclerView recyclerViewAd, recyclerViewOffer;
    ArrayList<Integer> array_image_ad,array_image_deal;
    ArrayList<String> array_name,array_category,array_price,array_offer;

    RecyclerView.LayoutManager RecyclerViewLayoutManager,RecyclerViewLayoutManager2;
    dealsAdapter dealsadapter;
    LinearLayoutManager HorizontalLayout,HorizontalLayout2;
    int adItem_id, offerItem_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
    }

    public void AddItemsToRecyclerViewArrayList() {


        array_image_deal = new ArrayList<Integer>();
        array_image_deal.add(R.drawable.car_advertisement);
        array_image_deal.add(R.drawable.car_advertisement);
        array_image_deal.add(R.drawable.car_advertisement);

        array_name = new ArrayList<String>();
        array_category = new ArrayList<String>();
        array_price = new ArrayList<String>();
        array_offer = new ArrayList<String>();

        array_name.add("Fan");
        array_name.add("Pen");
        array_name.add("Chocolate");

        array_category.add("household");
        array_category.add("household");
        array_category.add("household");

        array_price.add("Rs. 1,000");
        array_price.add("Rs. 10");
        array_price.add("Rs. 5");

        array_offer.add("50%");
        array_offer.add("50%");
        array_offer.add("50%");

    }
}