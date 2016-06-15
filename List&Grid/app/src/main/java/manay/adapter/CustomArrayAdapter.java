package manay.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import manay.listgrid.R;

/**
 * Created by Lenovo on 6/14/2016.
 */
public class CustomArrayAdapter extends ArrayAdapter<String> {

    private Activity myActivity;
    private ArrayList<String> item;

    public CustomArrayAdapter(Activity activity, ArrayList<String> resource) {
        super(activity, R.layout.list_column, resource);

        myActivity = activity;
        item = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = myActivity.getLayoutInflater().inflate(R.layout.list_column, null, false);

        ImageView imageItem = (ImageView) rowView.findViewById(R.id.image_item);
        TextView textItem = (TextView) rowView.findViewById(R.id.text_item);

        imageItem.setImageResource(R.mipmap.racket);
        textItem.setText(item.get(position));
        return rowView;
    }
}