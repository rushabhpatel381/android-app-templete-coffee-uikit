package com.wolfsoft.coffe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Customize_Drink_MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize__drink__main);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        img8=findViewById(R.id.img8);
        img9=findViewById(R.id.img9);



        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        img8.setOnClickListener(this);
        img9.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.img1:

                img1.setImageResource(R.drawable.ic_coffeecup1);
                img2.setImageResource(R.drawable.ic_coffee);
                img3.setImageResource(R.drawable.ic_fill_7);

                break;
            case R.id.img2:

                img1.setImageResource(R.drawable.ic_coffeecup);
                img2.setImageResource(R.drawable.ic_coffee_2);
                img3.setImageResource(R.drawable.ic_fill_7);


                break;
            case R.id.img3:


                img1.setImageResource(R.drawable.ic_coffeecup);
                img2.setImageResource(R.drawable.ic_coffee);
                img3.setImageResource(R.drawable.ic_fill_7_1);
                break;

            case R.id.img4:
                img4.setImageResource(R.drawable.ic_group_4_copy_1);
                img5.setImageResource(R.drawable.ic_group_4_copy_2);
                img6.setImageResource(R.drawable.ic_group_4_copy_3);
                img7.setImageResource(R.drawable.ic_group_4_copy_4);
                break;

            case R.id.img5:
                img4.setImageResource(R.drawable.ic_group_4_copy);
                img5.setImageResource(R.drawable.ic_group_4_copy_2_1);
                img6.setImageResource(R.drawable.ic_group_4_copy_3);
                img7.setImageResource(R.drawable.ic_group_4_copy_4);
                break;

            case R.id.img6:
                img4.setImageResource(R.drawable.ic_group_4_copy);
                img5.setImageResource(R.drawable.ic_group_4_copy_2);
                img6.setImageResource(R.drawable.ic_group_4_copy_3_1);
                img7.setImageResource(R.drawable.ic_group_4_copy_4);
                break;

            case R.id.img7:
                img4.setImageResource(R.drawable.ic_group_4_copy);
                img5.setImageResource(R.drawable.ic_group_4_copy_2);
                img6.setImageResource(R.drawable.ic_group_4_copy_3);
                img7.setImageResource(R.drawable.ic_group_4_copy_4_1);
                break;

            case R.id.img8:
                img8.setImageResource(R.drawable.ic_fill_4_1);
                img9.setImageResource(R.drawable.ic_fill_8);
                break;
            case R.id.img9:
                img8.setImageResource(R.drawable.ic_fill_4);
                img9.setImageResource(R.drawable.ic_fill_8_1);
                break;



        }
    }
}

