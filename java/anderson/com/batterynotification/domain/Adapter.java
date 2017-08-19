package anderson.com.batterynotification.domain;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anderson on 28/10/2016.
 */

public abstract class Adapter extends BaseAdapter {

    protected List<?> items;
    protected LayoutInflater inflater;

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        Item item = (Item) items.get(position);
        return item.getIconId();
    }

    static class ViewHolder{
        ImageView icon;
        TextView label;
    }
}
