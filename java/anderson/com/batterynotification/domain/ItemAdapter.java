package anderson.com.batterynotification.domain;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import anderson.com.batterynotification.R;

/**
 * Created by Anderson on 28/10/2016.
 */

public class ItemAdapter extends Adapter {

    public ItemAdapter(Context context, List<Item> items){
        this.items = items;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        Item item = (Item) items.get(position);

        if( convertView == null ){
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.item_grid, parent, false);
            convertView.setTag( holder );

            holder.icon = (ImageView) convertView.findViewById(R.id.iv_icon);
            holder.label = (TextView) convertView.findViewById(R.id.tv_label);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.icon.setImageResource( item.getIconId() );
        holder.label.setText( item.getLabel() );

        return convertView;
    }
}
