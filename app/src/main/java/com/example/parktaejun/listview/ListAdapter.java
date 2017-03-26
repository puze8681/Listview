package com.example.parktaejun.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by parktaejun on 2017. 3. 26..
 */

public class ListAdapter extends BaseAdapter{

    private Context context;
    private List<Data> items;

    public ListAdapter(Context context, List<Data> items){
        this.context = context;
        this.items = items;
    }

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
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.memo_item, null);
        LinearLayout container = (LinearLayout) view.findViewById(R.id.container);
        TextView text = (TextView) view.findViewById(R.id.text);
        text.setText(items.get(position).getText());
        return view;
    }

}
