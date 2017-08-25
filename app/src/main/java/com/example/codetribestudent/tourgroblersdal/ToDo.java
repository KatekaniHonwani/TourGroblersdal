package com.example.codetribestudent.tourgroblersdal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDo extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do);

        final ArrayList<TourGuide> tours=new ArrayList<TourGuide>();
        tours.add(new TourGuide(R.drawable.milkylane,"Milky Lane",""));
        tours.add(new TourGuide(R.drawable.spur,"Yellowstone Creek Spur",""));
        tours.add(new TourGuide(R.drawable.blackwood,"The buck and Lion Restaurant"," "));
        tours.add(new TourGuide(R.drawable.wimpy,"Wimpy ",""));
        tours.add(new TourGuide(R.drawable.nandos,"Nandos",""));
        tours.add(new TourGuide(R.drawable.outdoor,"Dennis Restaurant",""));
        CustomAdapter adapter=new CustomAdapter(this,tours);

        ListView listView=(ListView)findViewById(R.id.listview1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TourGuide tourGuide=tours.get(position);
                intent = new Intent(ToDo.this,Results.class);
                intent.putExtra("tour_guide", tourGuide);
                startActivity(intent);
            }
        });
    }
}

