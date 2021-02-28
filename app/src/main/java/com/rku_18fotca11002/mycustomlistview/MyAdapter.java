package com.rku_18fotca11002.mycustomlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Item> list;

    public MyAdapter(Context context, ArrayList<Item> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.listitem, parent, false);

        TextView name = (TextView) rowView.findViewById(R.id.txtName);
        TextView date = (TextView) rowView.findViewById(R.id.txtDate);
        TextView time = (TextView) rowView.findViewById(R.id.txtTime);
        TextView number = (TextView) rowView.findViewById(R.id.txtNumber);
        ImageView image = (ImageView) rowView.findViewById(R.id.image);

        name.setText(list.get(position).getName());
        time.setText(list.get(position).getTime());
        number.setText(list.get(position).getNumber());
        date.setText(list.get(position).getDate());
        image.setBackgroundResource(list.get(position).getImage());

        return rowView;
    }
}
