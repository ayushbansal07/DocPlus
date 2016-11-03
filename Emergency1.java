package com.example.abans_000.docplus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Emergency1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency1);
        final DBHandleEmer dbHandleEmer;
        dbHandleEmer = new DBHandleEmer(Emergency1.this,null,null,1);

       /* Button emnext = (Button) findViewById(R.id.emnext);
        emnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Emergency2 = new Intent(Emergency1.this,Emergency2.class);
                startActivity(Emergency2);

            }
        });*/

        final EditText emage = (EditText) findViewById(R.id.emage);
        final EditText emdate = (EditText) findViewById(R.id.emdate);
        final EditText emaddress = (EditText) findViewById(R.id.emaddress);
        final EditText emmobile = (EditText) findViewById(R.id.emmobile);
        final EditText emname = (EditText) findViewById(R.id.emname);
        final EditText emcond = (EditText) findViewById(R.id.emcond);
        final EditText emhis = (EditText) findViewById(R.id.emhis);
        RadioGroup emrg = (RadioGroup) findViewById(R.id.emrg);
        final EditText emnamevisit = (EditText) findViewById(R.id.emnamevisit);
        final EditText emmobvisit = (EditText) findViewById(R.id.emmobvisit);
        final EditText emrelation = (EditText) findViewById(R.id.emrelation);
        final int checked = emrg.getCheckedRadioButtonId();
        Button emsub = (Button) findViewById(R.id.emsub);

        emsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int age =Integer.parseInt(emage.getText().toString());
                String date = emdate.getText().toString();
                String address = emaddress.getText().toString();
                String mobile = emmobile.getText().toString();
                String name = emname.getText().toString();
                String cond = emcond.getText().toString();
                String history = emhis.getText().toString();
                String namevisit = emnamevisit.getText().toString();
                String mobvisit = emmobvisit.getText().toString();
                String relation = emrelation.getText().toString();
                String sex;
                if(checked == R.id.emmale)
                {
                    sex="M";
                }
                else if(checked == R.id.emfemale)
                {
                    sex ="F";
                }
                else
                {
                    sex = "O";
                }



                EmergencyDB emergencyDB = new EmergencyDB(age,sex,date,address,mobile,cond,history,namevisit,relation,mobvisit,name);
                dbHandleEmer.addProduct(emergencyDB);


            }
        });



    }
}
