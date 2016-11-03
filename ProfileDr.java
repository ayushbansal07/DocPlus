package com.example.abans_000.docplus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileDr extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_dr);
       /* TextView pname =(TextView)findViewById(R.id.pname);
        TextView pmobile =(TextView)findViewById(R.id.pmobile);
        TextView page = (TextView)findViewById(R.id.page);
        TextView psex=(TextView)findViewById(R.id.psex);*/
        //Button pmessage=(Button)findViewById(R.id.pmessage);

        Bundle bundle = getIntent().getExtras();
        TextView alldata = (TextView) findViewById(R.id.alldata);
        alldata.setText(bundle.getString("dbString"));
        /*pname.setText(bundle.getString("name"));
        pmobile.setText(bundle.getString("mobile"));
        page.setText(bundle.getString("age"));
        psex.setText(bundle.getString("sex"));*/
         Button pmesage = (Button) findViewById(R.id.pmessage);
        pmesage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfileDr.this,DrInbox.class);
                startActivity(i);
            }
        });

    }
}
