package com.example.dell.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import com.example.dell.adapter.SingleArrayAdapter;
import com.example.dell.model.CustomModel;
import com.example.dell.model.Restaurant;
import com.example.dell.restaurantsmovies.R;

import java.util.ArrayList;

/**
 * Created by DELL on 6/15/2016.
 */
public class RestaurantFragment extends Fragment{

    SingleArrayAdapter listViewAdapter;
    ArrayList<CustomModel> restaurants;
    ListView list;
    GridView grid;
    boolean gridViewVisible;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return init(inflater, container);
    }

    private View init(LayoutInflater inflater, ViewGroup container) {
/*
        if (container!=null)
            container.removeAllViews();
*/
        Log.e("TESTING","ROOT: "+(container!=null));
        if (view != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        gridViewVisible = false;
        linkXML(view);

        restaurants = new ArrayList<>();
        populateArray();

        switchView();

        return view;
    }

    private void linkXML(View view) {
        list = (ListView) view.findViewById(R.id.listview_items);
        grid = (GridView) view.findViewById(R.id.gridview_items);
        ((Button) view.findViewById(R.id.button_random)).setText("Restaurant");
    }

    private void populateArray() {
        restaurants.add(new Restaurant("KBC"));
        restaurants.add(new Restaurant("McDonalds"));
        restaurants.add(new Restaurant("Salateen"));
        restaurants.add(new Restaurant("Arizona Grills"));
        restaurants.add(new Restaurant("Burger Lab"));
        restaurants.add(new Restaurant("Burger Shack"));
    }

    private void setListAdapter() {
        listViewAdapter = new SingleArrayAdapter(getActivity(), restaurants);
        list.setAdapter(listViewAdapter);
    }

    private void setGridAdapter() {
    }

    private void switchView() {
        if (gridViewVisible) {
            list.setVisibility(View.GONE);
            grid.setVisibility(View.VISIBLE);
            setGridAdapter();
        } else {
            grid.setVisibility(View.GONE);
            list.setVisibility(View.VISIBLE);
            setListAdapter();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroyView();
        if (view != null) {
            ViewGroup parentViewGroup = (ViewGroup) view.getParent();
            if (parentViewGroup != null) {
                parentViewGroup.removeAllViews();
            }
        }
    }
}
