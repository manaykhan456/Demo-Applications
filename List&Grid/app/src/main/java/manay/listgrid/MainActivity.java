package manay.listgrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import manay.adapter.CustomArrayAdapter;
import manay.helper.Utils;

public class MainActivity extends AppCompatActivity {

    ListView listItems;
    CustomArrayAdapter adapter;
    ArrayList<String> array;
    ArrayList<Integer> pictures;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItems= (ListView) findViewById(R.id.listView);
        Button gridView= (Button) findViewById(R.id.grid_button);

        init();
        listItems.setAdapter(adapter);

        gridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gridIntent= new Intent(MainActivity.this , GridActivity.class);
                startActivity(gridIntent);
                finish();

            }
        });

    }

    private void init(){
        array=new ArrayList<>();
        pictures= new ArrayList<>();
        populateArray();
        adapter= new CustomArrayAdapter(this, array);
    }


    protected void populateArray(){
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");
        pictures.add(R.mipmap.racket);
        array.add ("Badminton racket");



       // Utils.snackBarNotification(getApplicationContext(), findViewById(R.id.main_layout), "Array Populated", false);
    }
}
