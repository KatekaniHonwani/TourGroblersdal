package com.example.codetribestudent.tourgroblersdal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Attractions extends AppCompatActivity {

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        final ArrayList<TourGuide> tours=new ArrayList<TourGuide>();
        tours.add(new TourGuide(R.drawable.caravanpark,"Serengeti Caravan Park ","Sleeps 55 people in 18 rooms ","Excellent[1 verified review]"+"\n"+ "Airport transfers "+"\n"+" Child Friendly "+"\n"+ "Aircon "+ "\n" +"Free Parking  "+"\n"+ "Swimming Pool "));
        tours.add(new TourGuide(R.drawable.loskop,"Loskop Dam","Sleeps 32 people in 8 Units ","\n"+" Child Friendly "+"\n"+ "Aircon "+ "Free Parking  "+"\n"+ "Swimming Pool "));
        tours.add(new TourGuide(R.drawable.golfcourse,"Golf Course","Sleeps 24 people in 9 rooms ","Excellent[1 verified review]"+"\n"+ "Airport transfers "+"\n"+" Child Friendly "+"\n"+ "Aircon "+ "Free Parking  "+"\n"+ "Swimming Pool "+ "\n "+"Free WiFi  "));
        tours.add(new TourGuide(R.drawable.boatracing,"Boat Riding ","Sleeps 12 people in 6 rooms ", "Child Friendly "+"\n"+ "Aircon "+ "Free Parking  "+"\n"+ "Swimming Pool "+ "\n"+"Free WiFi  "));
        tours.add(new TourGuide(R.drawable.spa," Spa Massage ","Sleeps 16 people in 8 rooms ","Child Friendly "+"\n"+ "Aircon " +"\n"+ "Free Parking  "+"\n"+ "Swimming Pool "+ "\n" +"Free WiFi  "));
        tours.add(new TourGuide(R.drawable.pigeonshooting,"Field and Stream Pigeon Shooting ","Sleeps 22 people in 4 units ","Excellent[1 verified review]"+"\n"+ " Child Friendly "+"\n"+ "Aircon "+"\n"+ "Free Parking  "+"\n"+ "Swimming Pool "+"\n"+  "Free WiFi  "));
        CustomAdapter adapter=new CustomAdapter(this,tours);

        ListView listView=(ListView)findViewById(R.id.listview1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TourGuide tourGuide=tours.get(position);
                intent = new Intent(Attractions.this,Results.class);
                intent.putExtra("tour_guide", tourGuide);
                startActivity(intent);
            }
        });
    }
}
