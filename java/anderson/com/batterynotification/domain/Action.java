package anderson.com.batterynotification.domain;

import android.os.Parcel;
import android.os.Parcelable;

import anderson.com.batterynotification.MainActivity;

/**
 * Created by Anderson on 28/10/2016.
 */

public class Action extends Item {

    public Action(int iconId, String label, int idSwitch) {
        super(iconId, label, idSwitch);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
    }

    protected Action(Parcel in) {
        super(in);
    }

    public static final Parcelable.Creator<Action> CREATOR = new Parcelable.Creator<Action>() {
        public Action createFromParcel(Parcel source) {
            return new Action(source);
        }

        public Action[] newArray(int size) {
            return new Action[size];
        }
    };
}
