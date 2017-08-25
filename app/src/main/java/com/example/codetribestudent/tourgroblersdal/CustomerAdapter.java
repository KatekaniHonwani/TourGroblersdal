package com.example.codetribestudent.tourgroblersdal;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by CodeTribeStudent on 7/27/2017.
 */

public class CustomerAdapter extends PagerAdapter {

    private int[] images={R.drawable.bushfellows};
    private Context context;
    private LayoutInflater inflater;


    public  CustomerAdapter(Context c)

    {
        this.context=c;
    }
    @Override

    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(RelativeLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View item_view=inflater
                .inflate(R.layout.swpe_layout,container,false);
        ImageView imageView=(ImageView)item_view.findViewById(R.id.image);
        TextView text=(TextView)item_view
                .findViewById(R.id.text);


        imageView.setImageResource(images[position]);
        text.setText("Groblersdal is part of what is known as the Cultural Heartland of Mpumalanga in South Africa. Interestingly, Groblersdal all started because of the irrigation scheme of the spectacular Loskop Dam and is named after the original owner of the Klipbank farm, WJ Grobler.\n" +
                "Groblersdal is cosy farming town and situated just 15 minutes north of the massive Loskop Dam. Because of its position, this lovely town is South Africa’s second largest irrigation settlement. As you enter this area, you will spot the floodplains of cotton, tobacco, table grapes, citrus fruit, maize, wheat, vegetables, sunflower seeds, peanuts, peaches as well as Lucerne.\n" +
                "As with other parts of the Cultural Heartland, Groblersdal is well known for its rather colourful Ndebele culture. The Ndebele people are recognised for their vibrant house painting, gorgeous bead work and crafts. All these works are on display at numerous cultural villages in the region. Another inherent characteristic of the Cultural Heartland is the Boer War route throughout the region. This route is ideal for history lovers.\n" +
                "Groblersdal is home to an abundance of game farms. You'll also be glad to know that game viewing in Groblersdal can be enjoyed on foot and is an all-year-round event. Yet, instead of the traditional game viewing experience usually offered, Groblersdal affords visitors the spectacular opportunity of game viewing by boat at the Loskop Dam Nature Reserve. This protected area is alive with an abundance of vibrant birdlife and fascinating wildlife.\n" +
                "The Loskop Dam is also a preferred angling destination because of its abundant bream and carp draughts. Boat slipways are available for use on the dam. The Loskop Dam Aventura Resort and Nature Reserve is a popular destination and offers tennis and swimming pools to mention just a few. Visit the lovely farms and farm stalls and learn more of this picturesque area.\n" +
                "Groblersdal not only offers a rich cultural experience but also a relaxing holiday is tranquil and magnificent surroundings. Its ideal destination near the Loskop Dam and Nature Reserve opens the way for a perfect holiday experience.\n");
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ScrollView) object);
    }
}
