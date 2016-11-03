package com.example.abans_000.docplus;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class DrInbox extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr_inbox);

        String[] name = {"Ayush", "Tanay", "Sibby"};
        String[] cond = {"Bad", "Good", "Awesome"};
        ListAdapter myAdapter = new CustomAdapter(this, name);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);
    }
}
