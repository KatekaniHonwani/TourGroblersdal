package com.example.codetribestudent.tourgroblersdal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Entertainment extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);

        final ArrayList<TourGuide> tours=new ArrayList<TourGuide>();
        tours.add(new TourGuide(R.drawable.nightrace,"The Night Race","","The race accommodates all types of ages" +"\n"+"Click the Find Out more button for details"));
        tours.add(new TourGuide(R.drawable.karaokenight,"Karaoke Gelado Club","","Night Club jam packed with all sorts fun "+"\n"+"Click the Find Out more button for details") );
        tours.add(new TourGuide(R.drawable.groblersdalmall,"Groblersdal Mall","","Shopping centre filled with attractions and lots of fun"+"\n"+"Click the Find Out more button for details"));
        tours.add(new TourGuide(R.drawable.matebeleland,"Ndebele Heritage ","","The Ndebele tribe heritage site , Culture quest "+"\n"+"Click the Find Out more button for details"));
        tours.add(new TourGuide(R.drawable.waterslides,"Groblersdal WaterSlides","","Groblersdal Water Centre for all ages "+"\n"+"Click the Find Out more button for details"));
        tours.add(new TourGuide(R.drawable.caravanpark,"Caravan Park Game Reserve ","","Game reserve in Groblersdal "+"\n"+"Click the Find Out more button for details"));
        CustomAdapter adapter=new CustomAdapter(this,tours);

        ListView listView=(ListView)findViewById(R.id.listview1);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TourGuide tourGuide=tours.get(position);
                intent = new Intent(Entertainment.this,Results.class);
                intent.putExtra("tour_guide", tourGuide);
                startActivity(intent);
            }
        });
    }
}

