package manay.listgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

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

        init();
        listItems.setAdapter(adapter);

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

    }
}
