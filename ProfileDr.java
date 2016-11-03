package com.example.android.docplusplus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class ProfileDr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_dr);
        TextView pname =(TextView)findViewById(R.id.pname);
        TextView pmobile =(TextView)findViewById(R.id.pmobile);
        TextView page = (TextView)findViewById(R.id.page);
        TextView psex=(TextView)findViewById(R.id.psex);
        Button pmessage=(Button)findViewById(R.id.pmessage);
    }
}
