package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.wolfsoft.coffe.R;

import java.util.ArrayList;

import model.Customized_drink_Model;

/**
 * Created by wolfsoft4 on 14/8/18.
 */

public class Customized_drink_Adapter extends RecyclerView.Adapter<Customized_drink_Adapter.ViewHolder> {
    Context context;
    private ArrayList<Customized_drink_Model> customized_drink_modelArrayList;

    @Override
    public Customized_drink_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_customize__drink__main,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Customized_drink_Adapter.ViewHolder holder, int position) {
        holder.img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }

    @Override
    public int getItemCount() {
        return customized_drink_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;

        public ViewHolder(View itemView) {
            super(itemView);

            img1=itemView.findViewById(R.id.img1);
            img2=itemView.findViewById(R.id.img2);
            img3=itemView.findViewById(R.id.img3);
            img4=itemView.findViewById(R.id.img4);
            img5=itemView.findViewById(R.id.img5);
            img6=itemView.findViewById(R.id.img6);
            img7=itemView.findViewById(R.id.img7);
            img8=itemView.findViewById(R.id.img8);
            img9=itemView.findViewById(R.id.img9);

        }
    }
}
