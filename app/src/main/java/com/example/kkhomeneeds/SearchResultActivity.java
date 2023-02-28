package com.example.kkhomeneeds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SearchResultActivity extends AppCompatActivity {

    private RecyclerView recyclerViewOffer;
    ArrayList<Integer> array_image_deal;
    ArrayList<String> array_name,array_category,array_price,array_offer;

    RecyclerView.LayoutManager RecyclerViewLayoutManager2;
    dealsAdapter dealsadapter;
    LinearLayoutManager HorizontalLayout2;
    int offerItem_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        recyclerViewOffer = findViewById(R.id.recyclerview_products1);

        RecyclerViewLayoutManager2 = new LinearLayoutManager(getApplicationContext());


        offerItem_id = R.layout.activity_search_result;
        recyclerViewOffer.setLayoutManager(RecyclerViewLayoutManager2);

        AddItemsToRecyclerViewArrayList();


        dealsadapter = new dealsAdapter(array_image_deal,array_name,array_category,array_price,array_offer, offerItem_id);

        HorizontalLayout2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        recyclerViewOffer.setLayoutManager(HorizontalLayout2);

        recyclerViewOffer.setAdapter(dealsadapter);
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