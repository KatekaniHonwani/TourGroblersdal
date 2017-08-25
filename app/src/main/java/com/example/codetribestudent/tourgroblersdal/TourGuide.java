package com.example.codetribestudent.tourgroblersdal;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by CodeTribeStudent on 8/3/2017.
 */

public class TourGuide implements Parcelable {

    private int image;
    private String name;
    private String details;
    private String information;

    public TourGuide() {
    }


    public TourGuide(int images, String names, String detail) {
        this.image=images;
        this.name=names;
        this.details=detail;

    }

    public TourGuide(int images, String names, String detail,String info) {
        this.image=images;
        this.name=names;
        this.details=detail;
        this.information=info;
    }

    protected TourGuide(Parcel in) {
        image = in.readInt();
        name = in.readString();
        details = in.readString();
        information = in.readString();
    }

    public static final Creator<TourGuide> CREATOR = new Creator<TourGuide>() {
        @Override
        public TourGuide createFromParcel(Parcel in) {
            return new TourGuide(in);
        }

        @Override
        public TourGuide[] newArray(int size) {
            return new TourGuide[size];
        }
    };

    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }


    public void setInformation(String informations) {
        this.information = informations;
    }
    public String getInformation()
    {
        return information;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(name);
        dest.writeString(details);
        dest.writeString(information);
    }
}
