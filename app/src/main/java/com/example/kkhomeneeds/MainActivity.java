package com.example.kkhomeneeds;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewAd, recyclerViewOffer;
    ArrayList<Integer> array_image_ad,array_image_deal;
    ArrayList<String> array_name,array_category,array_price,array_offer;

    RecyclerView.LayoutManager RecyclerViewLayoutManager,RecyclerViewLayoutManager2;
    advertisementAdapter advertisementadapter;
    dealsAdapter dealsadapter;
    LinearLayoutManager HorizontalLayout,HorizontalLayout2;
    int adItem_id, offerItem_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewAd = findViewById(R.id.recyclerview_advertisement);
        recyclerViewOffer = findViewById(R.id.recyclerview_products);
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerViewLayoutManager2 = new LinearLayoutManager(getApplicationContext());

        adItem_id = R.layout.advertisement_item;
        offerItem_id = R.layout.offer_product_item;
        recyclerViewAd.setLayoutManager(RecyclerViewLayoutManager);
        recyclerViewOffer.setLayoutManager(RecyclerViewLayoutManager2);

        AddItemsToRecyclerViewArrayList();

        advertisementadapter = new advertisementAdapter(array_image_ad, adItem_id);
        dealsadapter = new dealsAdapter(array_image_deal,array_name,array_category,array_price,array_offer, offerItem_id);


        HorizontalLayout = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        HorizontalLayout2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerViewAd.setLayoutManager(HorizontalLayout);
        recyclerViewOffer.setLayoutManager(HorizontalLayout2);

        recyclerViewAd.setAdapter(advertisementadapter);
        recyclerViewOffer.setAdapter(dealsadapter);

    }
    public void AddItemsToRecyclerViewArrayList() {

        array_image_ad = new ArrayList<Integer>();
        array_image_ad.add(R.drawable.car_advertisement);
        array_image_ad.add(R.drawable.car_advertisement);
        array_image_ad.add(R.drawable.car_advertisement);

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