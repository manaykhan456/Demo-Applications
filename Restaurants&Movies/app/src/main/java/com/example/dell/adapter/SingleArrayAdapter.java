package com.example.dell.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.dell.model.CustomModel;
import com.example.dell.model.Restaurant;
import com.example.dell.restaurantsmovies.R;

import java.util.ArrayList;

/**
 * Created by DELL on 6/15/2016.
 */
public class SingleArrayAdapter extends ArrayAdapter{

    private Activity me;
    private ArrayList<CustomModel> item;

    public SingleArrayAdapter(Activity activity, ArrayList<CustomModel> resource){
        super(activity, R.layout.layout_listview_single, resource);

        me = activity;
        item = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = me.getLayoutInflater().inflate(R.layout.layout_listview_single, null, false);

        ((TextView) rowView.findViewById(R.id.single_listView_textView))
                .setText( item.get(position)
                        .getName() );

        return rowView;
    }
}
