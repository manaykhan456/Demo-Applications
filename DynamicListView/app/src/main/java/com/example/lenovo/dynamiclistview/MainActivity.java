package com.example.lenovo.dynamiclistview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
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
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView listItems;
    TextViewArrayAdapter adapter;
    ArrayList<String> array;
    Button addItemsButton;
    EditText etAddItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();
        listItems.setAdapter(adapter);
        listItems.setOnItemLongClickListener(new OnItemLongClickListener() {
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
        sorting();
        linkXML();
    }

    private void sorting(){
        adapter.sort(new Comparator<String>() {
            @Override
            public int compare(String lhs, String rhs) {
                return lhs.toLowerCase().compareTo(rhs.toLowerCase());
            }
        });
    }

    public void addingItemsViaDialog (View v){
        final Dialog dialog= new Dialog (this);
        dialog.setContentView(R.layout.dialogbox_layout);

        final EditText value= (EditText) dialog.findViewById(R.id.et_itemsAdd);
        dialog.findViewById(R.id.buttonAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                array.add(value.getText().toString());
                adapter.notifyDataSetChanged();
                sorting();
               adapter.notifyDataSetChanged();
                dialog.dismiss();

            }
        });
        dialog.show();
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
        listItems = (ListView) findViewById(R.id.listView1);
        addItemsButton=(Button) findViewById(R.id.addItems_button);
        etAddItems=(EditText)findViewById(R.id.et_itemsAdd);
    }

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