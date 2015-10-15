package com.ooad.ce.pinup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NewsFeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);
        ArrayList<Integer> resId = new ArrayList<Integer>();

        Intent intent = getIntent();
        int n = 0;
        n =   Integer.valueOf(intent.getStringExtra("loop"));


        for(int i =0;i<n;i++){
            resId.add(R.drawable.ic_launcher);
        }

        ArrayList<String> list1 = new ArrayList<String>();
        for(int i =0;i<n;i++){
            list1.add("Event " + i);
        }
        ArrayList<String> list2 = new ArrayList<String>();
        for(int i =0;i<n;i++){
            list2.add("Descript " + i);
        }


        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), list1,list2, resId);

        ListView listView = (ListView)findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
    }
}
