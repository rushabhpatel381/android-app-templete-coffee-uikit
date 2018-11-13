package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wolfsoft.coffe.R;

import java.util.ArrayList;

import model.Select_drink_Model;

/**
 * Created by wolfsoft4 on 9/8/18.
 */

public class Select_drink_Adapter extends RecyclerView.Adapter<Select_drink_Adapter.ViewHolder> {

    Context context;
    private ArrayList<Select_drink_Model> select_drink_modelArrayList;

    public Select_drink_Adapter(Context context, ArrayList<Select_drink_Model> select_drink_modelArrayList) {
        this.context = context;
        this.select_drink_modelArrayList = select_drink_modelArrayList;
    }

    @Override
    public Select_drink_Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_select_drink,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Select_drink_Adapter.ViewHolder holder, int position) {
        holder.imgespresso.setImageResource(select_drink_modelArrayList.get(position).getImgespresso());
        holder.imgrightarrow.setImageResource(select_drink_modelArrayList.get(position).getImgrightarrow());
        holder.txtespresso.setText(select_drink_modelArrayList.get(position).getTxtespresso());

    }

    @Override
    public int getItemCount() {
        return select_drink_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgespresso,imgrightarrow;
        TextView txtespresso;

        public ViewHolder(View itemView) {
            super(itemView);

            imgespresso=itemView.findViewById(R.id.imgespresso);
            imgrightarrow=itemView.findViewById(R.id.imgrightarrow);
            txtespresso=itemView.findViewById(R.id.txtespresso);
        }
    }
}
