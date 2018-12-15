package com.developer.willshuffy.meetap2.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developer.willshuffy.meetap2.R;

public class MainActivity extends AppCompatActivity {

    private Button btn_new;
    private Button btn_all;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_new= findViewById(R.id.btn_newOrder);
        btn_all= findViewById(R.id.btn_allOrder);

        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), ListMenuActivity.class);
                startActivity(intent);

            }
        });

        btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),getString(R.string.toast_onDevelopment), Toast.LENGTH_SHORT).show();


            }
        });
    }
}
