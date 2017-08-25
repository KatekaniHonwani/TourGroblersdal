package com.example.codetribestudent.tourgroblersdal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by CodeTribeStudent on 8/3/2017.
 */

public class CustomAdapter extends ArrayAdapter<TourGuide> {

    ArrayList<TourGuide> infoGuide;
    LayoutInflater inflater;
    Context c;

    public CustomAdapter(Context context, ArrayList<TourGuide> information) {
        super(context,0,information);
        this.c=context;
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView=convertView;

        if(listItemView==null)
        {
            listItemView= inflater.from(getContext()).inflate(R.layout.list_layout,parent,false);
        }

        TourGuide tourGuide=getItem(position);

        //INITIALIZE VIEW AND ASSIGN DATA


        TextView txtName=(TextView)listItemView.findViewById(R.id.txtName);
        txtName.setText(tourGuide.getName());

        TextView txtDetails=(TextView)listItemView.findViewById(R.id.txtTeam);
        txtDetails.setText(tourGuide.getDetails());

        ImageView Image =(ImageView)listItemView.findViewById(R.id.imageView2);
        Image.setImageResource(tourGuide.getImage());
        Image.setVisibility(View.VISIBLE);

        return   listItemView;
    }
}
