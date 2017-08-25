package com.example.codetribestudent.tourgroblersdal;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CustomerAdapter adapter;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new CustomerAdapter(this);
        viewPager.setAdapter(adapter);
    }

    public void more(View view)
    {
        Intent intent=new Intent(MainActivity.this,AboutGroblesdal.class);
        startActivity(intent);
    }

}