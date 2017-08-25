package com.example.codetribestudent.tourgroblersdal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Results extends AppCompatActivity {

    ImageView pic;
    TextView title, details, info;
    Button btn;
    AlertDialog.Builder builder;
    TourGuide tourGuide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        pic = (ImageView) findViewById(R.id.picyure);
        title = (TextView) findViewById(R.id.title);
        details = (TextView) findViewById(R.id.details);
        info = (TextView) findViewById(R.id.information);
        btn = (Button)findViewById(R.id.button);

        Intent intent = getIntent();
        tourGuide = intent.getParcelableExtra("tour_guide");

        pic.setImageResource(tourGuide.getImage());
        title.setText(tourGuide.getName());
        details.setText(tourGuide.getDetails() );
        info.setText(tourGuide.getInformation());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                builder = new AlertDialog.Builder(Results.this);

                builder.setTitle(tourGuide.getName());

                    builder.setMessage("Location ");
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent (Intent.CATEGORY_APP_MAPS);
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();


                /*
                builder.setMessage("");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent (Intent.CATEGORY_APP_MAPS);
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
                */
            }
        });
    }
}
