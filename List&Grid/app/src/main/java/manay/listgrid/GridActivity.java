package manay.listgrid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

import manay.adapter.CustomAdapter;

/**
 * Created by Lenovo on 6/15/2016.
 */
public class GridActivity extends Activity {
    GridView gv;
    Context context;
    ArrayList <String> item;
    public static ArrayList<String> nameList;
    public static int [] prgmImages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gird_view);
        gv=(GridView) findViewById(R.id.gridView1);
        populateArray();
        gv.setAdapter(new CustomAdapter(this, nameList , prgmImages));

        Button listButton= (Button) findViewById(R.id.list_button);



        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listIntent= new Intent (GridActivity.this , MainActivity.class);
                startActivity(listIntent);
                finish();
            }
        });
    }
    private void populateArray(){
        nameList = new ArrayList<>();
        prgmImages = new int[10];

        for (int i=0; i<10; i++){
            nameList.add("Racket");
            prgmImages[i] = R.mipmap.racket;
        }
    }

}
