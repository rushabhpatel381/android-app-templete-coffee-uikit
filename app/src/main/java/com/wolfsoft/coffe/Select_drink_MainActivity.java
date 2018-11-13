package com.wolfsoft.coffe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import adapter.Select_drink_Adapter;
import model.Select_drink_Model;

public class Select_drink_MainActivity extends AppCompatActivity {
    private Select_drink_Adapter select_drink_adapter;
    private RecyclerView recyclerView;
    private ArrayList<Select_drink_Model> select_drink_modelArrayList;

    Integer  imgespresso[]={R.drawable.ic_espresso,R.drawable.ic_cappuccino,R.drawable.ic_macciato,R.drawable.ic_mocha,R.drawable.ic_latte};
    Integer  imgrightarrow[]={R.drawable.ic_keyboard_arrow_right_black_24dp,R.drawable.ic_keyboard_arrow_right_black_24dp,R.drawable.ic_keyboard_arrow_right_black_24dp,R.drawable.ic_keyboard_arrow_right_black_24dp,R.drawable.ic_keyboard_arrow_right_black_24dp};
    String   txtespresso[]={"Espresso","Cappuccino","Macciato","Mocha","Latte"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_drink__main);

        recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Select_drink_MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        select_drink_modelArrayList = new ArrayList<>();

        for (int i = 0; i < imgespresso.length; i++) {
            Select_drink_Model view = new Select_drink_Model(imgespresso[i],imgrightarrow[i], txtespresso[i]);
            select_drink_modelArrayList.add(view);
        }
        select_drink_adapter = new Select_drink_Adapter(Select_drink_MainActivity.this,select_drink_modelArrayList);
        recyclerView.setAdapter(select_drink_adapter);
    }

}
