package com.example.lenovo.dynamiclistview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
public class MainActivity extends Activity {
    ListView lv;
    TextViewArrayAdapter adapter;
    ArrayList<String> array;
    Button addItemsButton;
    EditText etAddItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addItemsButton=(Button) findViewById(R.id.addItems_button);
        etAddItems=(EditText)findViewById(R.id.et_addItems);




        init();

        lv.setAdapter(adapter);

        addItemsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array.add (etAddItems.getText().toString());
            }
        });



        lv.setOnItemLongClickListener(new OnItemLongClickListener() {
            // setting onItemLongClickListener and passing the position to the function
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int position, long arg3) {
                removeItemFromList(position);

                return true;
            }
        });
    }

    private void init() {
        array = new ArrayList<>();
        populateArray();
        adapter = new TextViewArrayAdapter(this, array);

        adapter.sort(new Comparator<String>() {
            @Override
            public int compare(String lhs, String rhs) {
                return lhs.compareTo(rhs);
            }
        });
        linkXML();
    }

    private void populateArray() {
        array.add("PHP");
        array.add("HTML");
        array.add("Android");
        array.add("Studio");
        array.add ("Manay");
        array.add ("Khan");
    }



    private void linkXML() {
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView1);
    }



    // method to remove list item
    protected void removeItemFromList(int position) {
        final int deletePosition = position;

        AlertDialog.Builder alert = new AlertDialog.Builder(
                MainActivity.this);

        alert.setTitle("Delete");
        alert.setMessage("Do you want delete this item?");
        alert.setPositiveButton("YES", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TOD O Auto-generated method stub

                // main code on after clicking yes
                array.remove(deletePosition);
                adapter.notifyDataSetChanged();
                adapter.notifyDataSetInvalidated();

            }
        });
        alert.setNegativeButton("CANCEL", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                dialog.dismiss();
            }
        });

        alert.show();

    }
}