package id.duza.customadapter.adapter;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import id.duza.customadapter.R;
import id.duza.customadapter.model.Chat;

/**
 * Created by dhiyaulhaqza on 3/18/17.
 */

public class SimpleAdapter extends ArrayAdapter<Chat> {

    public SimpleAdapter(@NonNull Context context, @NonNull List<Chat> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)    {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.tv_item_name);
        TextView tvMessage = (TextView) convertView.findViewById(R.id.tv_item_message);
        TextView tvTime = (TextView) convertView.findViewById(R.id.tv_item_time);

        Chat chat = getItem(position);

        if (chat != null)   {
            tvName.setText(chat.getName());
            tvMessage.setText(chat.getMessage());
            tvTime.setText(chat.getTime());
        }

        return convertView;
    }
}
