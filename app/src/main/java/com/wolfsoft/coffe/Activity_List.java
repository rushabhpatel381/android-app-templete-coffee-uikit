package com.wolfsoft.coffe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.CoffeeList_RecyAdapter;
import model.CoffeelistModel;

public class Activity_List extends AppCompatActivity {

    private CoffeeList_RecyAdapter coffeeList_recyAdapter;
    private RecyclerView recyclerview;
    private ArrayList<CoffeelistModel> coffeelistModelArrayList;

    String txt[]={"activity_splash_main","activity_on_boarding_main","activity_login_main","activity_select_drink_main","activity_customize_drink_main"};


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list);

        recyclerview=findViewById(R.id.recyclerView1);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(Activity_List.this);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        coffeelistModelArrayList = new ArrayList<>();

        for (int i=0;i<txt.length;i++){

            CoffeelistModel coffeelistModel = new CoffeelistModel(txt[i]);

            coffeelistModelArrayList.add(coffeelistModel);

        }
        coffeeList_recyAdapter = new CoffeeList_RecyAdapter(Activity_List.this,coffeelistModelArrayList);
        recyclerview.setAdapter(coffeeList_recyAdapter);


    }
}
