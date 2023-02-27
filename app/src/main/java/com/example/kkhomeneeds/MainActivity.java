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
    private RecyclerView recyclerView;
    ArrayList<Integer> array_image;

    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    advertisementAdapter adapter;
    LinearLayoutManager HorizontalLayout;
    int item_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview_advertisement);
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());

        item_id = R.layout.advertisement_item;
        recyclerView.setLayoutManager(RecyclerViewLayoutManager);

        AddItemsToRecyclerViewArrayList();

        adapter = new advertisementAdapter(array_image, item_id);

        HorizontalLayout = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(HorizontalLayout);



        recyclerView.setAdapter(adapter);

    }
    public void AddItemsToRecyclerViewArrayList() {

        array_image = new ArrayList<Integer>();
        array_image.add(R.drawable.car_advertisement);
        array_image.add(R.drawable.car_advertisement);
        array_image.add(R.drawable.car_advertisement);

    }
}