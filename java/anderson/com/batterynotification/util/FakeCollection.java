package anderson.com.batterynotification.util;

import java.util.ArrayList;

import anderson.com.batterynotification.domain.Action;
import anderson.com.batterynotification.domain.Item;
import anderson.com.batterynotification.R;
import anderson.com.batterynotification.domain.Action;
import anderson.com.batterynotification.domain.Item;

/**
 * Created by Anderson on 28/10/2016.
 */

public final class FakeCollection {

    static private ArrayList<Action> actions;
    static private ArrayList<Item> items;

    private FakeCollection(){}

    static public ArrayList<Action> getActions(){
        if( actions == null ){
            actions = new ArrayList<>();
            actions.add( new Action(R.drawable.ic_action_activate, "Start notification", 0) );
            actions.add( new Action(R.drawable.ic_action_desactivate, "Stop notification", 0) );
            actions.add( new Action(R.drawable.ic_action_hide2, "Hide the app", 0));
        }
        return( actions );
    }
}
