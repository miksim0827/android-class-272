package com.example.user.simpleui;

import android.os.Parcel;
import android.os.Parcelable;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by user on 2016/8/11.
 */
@ParseClassName("Drink")        //包裝物件
public class Drink extends ParseObject implements Parcelable {
    static final String NAME_COL = "name";
    static final String MPRICE_COL = "mPrice";
    static final String LPRICE_COL = "lPrice";
    int imageId;

    public Drink() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.getName());
        dest.writeInt(this.getmPrice());
        dest.writeInt(this.getlPrice());
        dest.writeInt(this.imageId);
    }

    protected Drink(Parcel in) {
        this.setName(in.readString());
        this.getmPrice(in.readInt());
        this.getlPrice(in.readInt());
        this.imageId = in.readInt();
    }

    public static final Creator<Drink> CREATOR = new Creator<Drink>() {
        @Override
        public Drink createFromParcel(Parcel source) {
            return new Drink(source);
        }

        @Override
        public Drink[] newArray(int size) {
            return new Drink[size];
        }
    };

    public int getlPrice() {
        return lPrice;
    }

    public void setlPrice(int lPrice) {
        this.put();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getmPrice() {
        return mPrice;
    }

    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }
}
