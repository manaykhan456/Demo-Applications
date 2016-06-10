package com.example.lenovo.dynamiclistview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 6/10/2016.
 */
public class TextViewArrayAdapter extends ArrayAdapter<String>{

    private Activity jk;
    private ArrayList<String> item;

    public TextViewArrayAdapter(Activity activity, ArrayList<String> resource){
        super(activity, R.layout.list_row, resource);

        jk = activity;
        item = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = jk.getLayoutInflater().inflate(R.layout.list_row, null, false);

        TextView t1 = (TextView) rowView.findViewById(R.id.textView1);
        TextView t2 = (TextView) rowView.findViewById(R.id.textView2);

        t1.setText(item.get(position));
        t2.setText(String.valueOf(position+1));

        return rowView;
    }
}
