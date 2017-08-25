package com.example.codetribestudent.tourgroblersdal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AboutGroblesdal extends AppCompatActivity {

    ImageView accomodation,attraction,entertainment,todo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_groblesdal);

        accomodation=(ImageView)findViewById(R.id.Accomodation);
        attraction=(ImageView)findViewById(R.id.attractions);
        entertainment=(ImageView)findViewById(R.id.entertainment);
        todo=(ImageView)findViewById(R.id.todo);

        Picasso.with(getApplicationContext()).load("http://www.cdq.co.za/wp-content/uploads/2016/09/KH-bathroom-blackwhite-2.jpg").into(accomodation);
        Picasso.with(getApplicationContext()).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLloCdbfB6leuw-8bNYj9mC5MoeXpy_9NYq2amnTj2qpyASvIY").into(attraction);
        Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/09/22/00/56/lead-singer-455750_960_720.jpg").into(entertainment);
        Picasso.with(getApplicationContext()).load("https://gmractivityimg.s3.amazonaws.com/immagine15-720-17-03-2016-06-14.jpg").into(todo);

    }


    public void attractions(View view)
    {
        Intent intent= new Intent(AboutGroblesdal.this,Attractions.class);
        startActivity(intent);
    }

    public void accomodation(View view)
    {
        Intent intent= new Intent(AboutGroblesdal.this,Accomodation.class);
        startActivity(intent);
    }

    public void todo(View view)
    {
        Intent intent= new Intent(AboutGroblesdal.this,ToDo.class);
        startActivity(intent);
    }

    public void entertainment(View view)
    {
        Intent intent= new Intent(AboutGroblesdal.this,Entertainment.class);
        startActivity(intent);
    }

}
