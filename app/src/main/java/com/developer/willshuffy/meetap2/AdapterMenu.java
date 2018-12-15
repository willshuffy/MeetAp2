package com.developer.willshuffy.meetap2;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.developer.willshuffy.meetap2.activities.DetailActivity;
import com.developer.willshuffy.meetap2.models.Menu;

import java.util.ArrayList;
import java.util.List;

public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.ViewHolder> {

    Context context;
    private List<Menu> list;

    public AdapterMenu(Context context){
        this.context=context;
        list = new ArrayList<>();
    }

    @NonNull
    @Override
    public AdapterMenu.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent, false);
        final  AdapterMenu.ViewHolder holder=new AdapterMenu.ViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterMenu.ViewHolder holder, int position) {
        final Menu menu = list.get(holder.getAdapterPosition());
        holder.tvPrice.setText(menu.getCost());
        holder.tvName.setText(menu.getName());

        Glide.with(context)
                .load(menu.getImage())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .dontAnimate()
                .into(holder.ivMenu);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("key_menu", menu);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void add(Menu r) {
        list.add(r);
        notifyItemInserted(list.size() - 1);
    }

    public void addAll(List<Menu> moveResults) {
        for (Menu result : moveResults) {
            add(result);
        }
    }

    public void remove(Menu r) {
        int position = list.indexOf(r);
        if (position > -1) {
            list.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public void clearAll() {
        if (!list.isEmpty()){
            list.clear();
            notifyDataSetChanged();
        }
    }

    public boolean isEmpty() {
        return getItemCount() == 0;
    }

    public Menu getItem(int position) {
        if (list !=null){
            return list.get(position);
        }
        return null;

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
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
