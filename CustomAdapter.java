package com.example.abans_000.docplus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by abans_000 on 03-11-2016.
 */
public class CustomAdapter extends ArrayAdapter<String> {
    CustomAdapter(Context context, String[] name) {
        super(context, R.layout.custom_row ,name);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater buckysInflater = LayoutInflater.from(getContext());
        View customView = buckysInflater.inflate(R.layout.custom_row, parent, false);

        String names = getItem(position);
        TextView patname = (TextView) customView.findViewById(R.id.patname);

        patname.setText(names);
        return customView;
    }
}
