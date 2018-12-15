package com.developer.willshuffy.meetap2.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.developer.willshuffy.meetap2.R;
import com.developer.willshuffy.meetap2.models.Menu;

public class DetailActivity extends AppCompatActivity {

    private Menu menu;
    private ImageView ivDetail;
    private TextView tvName;
    private TextView tvPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ivDetail=findViewById(R.id.iv_detail);
        tvName=findViewById(R.id.tv_name_detail);
        tvPrice=findViewById(R.id.tv_price_detail);

        menu=getIntent().getParcelableExtra("key_menu");

        Glide.with(getApplicationContext())
                .load(menu.getImage())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .dontAnimate()
                .into(ivDetail);

        tvName.setText(menu.getName());
        tvPrice.setText(menu.getCost());

    }
}

