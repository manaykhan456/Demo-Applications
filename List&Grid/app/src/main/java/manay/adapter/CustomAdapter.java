package manay.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import manay.listgrid.MainActivity;
import manay.listgrid.R;

/**
 * Created by Lenovo on 6/15/2016.
 */
public class CustomAdapter extends BaseAdapter {
    ArrayList<String> item;
    Context context;
    int[] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter (Activity mainActivity, ArrayList<String> nameList, int[] prgmImages){
        item= nameList;
        context= mainActivity;
        imageId=prgmImages;
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return item.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.list_grid, null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView1);

        holder.tv.setText(item.get(position));
        holder.img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+item.get(position), Toast.LENGTH_LONG).show();
            }
        });

        return rowView;
    }

}