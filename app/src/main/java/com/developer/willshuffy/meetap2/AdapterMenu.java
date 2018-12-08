package com.developer.willshuffy.meetap2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.ViewHolder> {

    Context context;
    private List<Result> list;

    public AdapterMenu(Context context, List<Result>list){
        this.context=context;
        this.list=list;
    }

    @NonNull
    @Override
    public AdapterMenu.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent, false);
        final  AdapterMenu.ViewHolder holder=new ViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMenu.ViewHolder holder, int position) {
        Result result= list.get(holder.getAdapterPosition());
        holder.tvPrice.setText(result.getTitle());
        holder.tvName.setText(result.getRelease_date());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView ivMenu;
        public TextView tvName;
        public TextView tvPrice;
        public ViewHolder(View itemView) {
            super(itemView);
            ivMenu = itemView.findViewById(R.id.iv_menu);
            tvName = itemView.findViewById(R.id.tv_name);
            tvPrice = itemView.findViewById(R.id.tv_price);
        }
    }
}
