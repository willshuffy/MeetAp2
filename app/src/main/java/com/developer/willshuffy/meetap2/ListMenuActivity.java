package com.developer.willshuffy.meetap2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListMenuActivity extends AppCompatActivity {

    List<Result> resultList;
    private RecyclerView rvMovie;
    private AdapterMenu adapterMenu;
    private Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);

        //action baru

        resultList = new ArrayList<>();
        rvMovie = findViewById(R.id.rvData);
        adapterMenu=new AdapterMenu(this, resultList);
    }
}
