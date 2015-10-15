package com.ooad.ce.pinup;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by undine on 10/13/2015.
 */
public class CustomAdapter extends BaseAdapter
implements View.OnClickListener{

    Context titleComtex;
    ArrayList<String> titleEvent;
    ArrayList<String> descriptEvent;
    ArrayList<Integer> resId;

    public CustomAdapter(Context context, ArrayList<String> titleEvent,ArrayList<String> descriptEvent,ArrayList<Integer> resId) {
        this.titleComtex = context;
        this.titleEvent = titleEvent;
        this.descriptEvent = descriptEvent;
        this.resId = resId;
    }
    public int getCount() {
        return titleEvent.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }



    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater titleInflater = (LayoutInflater) titleComtex.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater descriptInflater = (LayoutInflater) titleComtex.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(view == null)
            view = titleInflater.inflate(R.layout.post, parent, false);

        TextView textView = (TextView)view.findViewById(R.id.textView1);
        textView.setText(titleEvent.get(position));
        TextView textView2 = (TextView)view.findViewById(R.id.textView2);
        textView2.setText(descriptEvent.get(position));


        return view;
    }

    @Override
    public void onClick(View v) {

    }
}
