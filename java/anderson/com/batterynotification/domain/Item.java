package anderson.com.batterynotification.domain;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

import anderson.com.batterynotification.MainActivity;
import anderson.com.batterynotification.R;

/**
 * Created by Anderson on 28/10/2016.
 */

public class Item implements Parcelable {

    private int iconId;
    private String label;
    private int idSwitch;


    public Item(int iconId, String label, int idSwitch){
        this.iconId = iconId;
        this.label = label;
        this.idSwitch = idSwitch;

    }

    public int getIconId(){
        return( this.iconId );
    }

    public String getLabel() {
        return label;
    }

    public int getIdSwitch() {
        return (this.idSwitch);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }

    protected Item(Parcel in) {
        this.iconId = in.readInt();
        this.label = in.readString();
        this.idSwitch = in.readInt();
    }

    public static final Creator<Item> CREATOR = new Creator<Item>() {
        public Item createFromParcel(Parcel source) {
            return new Item(source);
        }

        public Item[] newArray(int size) {
            return new Item[size];
        }
    };


}
