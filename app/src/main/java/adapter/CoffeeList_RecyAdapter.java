package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wolfsoft.coffe.Customize_Drink_MainActivity;
import com.wolfsoft.coffe.Login_MainActivity;
import com.wolfsoft.coffe.OnBoarding_MainActivity;
import com.wolfsoft.coffe.R;
import com.wolfsoft.coffe.Select_drink_MainActivity;
import com.wolfsoft.coffe.Splash_MainActivity;

import java.util.ArrayList;

import model.CoffeelistModel;

/**
 * Created by wolfsoft4 on 10/8/18.
 */

public class CoffeeList_RecyAdapter extends RecyclerView.Adapter<CoffeeList_RecyAdapter.ViewHolder> {
    Context context;
    private ArrayList<CoffeelistModel> coffeelistModelArrayList;

    public CoffeeList_RecyAdapter(Context context, ArrayList<CoffeelistModel> coffeelistModelArrayList) {
        this.context = context;
        this.coffeelistModelArrayList = coffeelistModelArrayList;
    }

    @Override
    public CoffeeList_RecyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coffee_list,parent,false);
        return new CoffeeList_RecyAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CoffeeList_RecyAdapter.ViewHolder holder, final int position) {
        holder.title.setText(coffeelistModelArrayList.get(position).getTitle());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(position==0){
                    Intent i = new Intent(context, Splash_MainActivity.class);
                    context.startActivity(i);}
                else if(position==1){
                    Intent i = new Intent(context, OnBoarding_MainActivity.class);
                    context.startActivity(i);}

                else if(position==2){
                    Intent i = new Intent(context, Login_MainActivity.class);
                    context.startActivity(i);}

                else if(position==3){
                    Intent i = new Intent(context, Select_drink_MainActivity.class);
                    context.startActivity(i);}

                else if(position==4){
                    Intent i = new Intent(context, Customize_Drink_MainActivity.class);
                    context.startActivity(i);}
            }
        });

    }

    @Override
    public int getItemCount(){
        return coffeelistModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public ViewHolder(View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);
        }
    }
}
