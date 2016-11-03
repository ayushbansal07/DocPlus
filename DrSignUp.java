package com.example.abans_000.docplus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DrSignUp extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr_sign_up);

        final DBHandleDr dbHandleDr;
        dbHandleDr = new DBHandleDr(this,null,null,1);

        final EditText drhospid = (EditText) findViewById(R.id.drhospid);
        final EditText drreg = (EditText) findViewById(R.id.drreg);
        final EditText drname =(EditText) findViewById(R.id.drname);
        final EditText dremail = (EditText) findViewById(R.id.dremil);
        final EditText drpassword = (EditText) findViewById(R.id.drpassword);
        final EditText drcnfpassword = (EditText) findViewById(R.id.drcnfpassword);
        final EditText drage = (EditText) findViewById(R.id.drage);
        final EditText drdate = (EditText) findViewById(R.id.drdate);
        final EditText draddress = (EditText) findViewById(R.id.draddress);
        final EditText drmob1 = (EditText) findViewById(R.id.drmob1);
        final EditText drmob2 = (EditText) findViewById(R.id.drmob2);
        final EditText drdeg = (EditText) findViewById(R.id.drdeg);
        Button drsign = (Button) findViewById(R.id.drsign);
        RadioGroup drrg = (RadioGroup) findViewById(R.id.drrg);
        final int checked = drrg.getCheckedRadioButtonId();

    drsign.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String hospid = drhospid.getText().toString();
            String reg = drreg.getText().toString();
            String name = drname.getText().toString();;
            String email = dremail.getText().toString();
            String password = drpassword.getText().toString();
            String cnfpassword = drcnfpassword.getText().toString();
            int age = Integer.parseInt(drage.getText().toString());
            String date = drdate.getText().toString();
            String address = draddress.getText().toString();
            String mob1 = drmob1.getText().toString();
            String mob2 = drmob2.getText().toString();
            String deg = drdeg.getText().toString();
            String sex;
            if(checked==R.id.drmale)
            {
                sex="M";
            }
            else if(checked==R.id.drfemale)
            {
                sex = "F";
            }
            else
            {
                sex="O";
            }

            if(password.equals(cnfpassword) && !password.equals(""))
            {
                DrSignUpDB drSignUpDB = new DrSignUpDB(age,hospid,reg,name,email,password,sex,date,address,mob1,mob2,deg);
                dbHandleDr.addProduct(drSignUpDB);
                Intent Main = new Intent(DrSignUp.this,MainActivity.class);
                startActivity(Main);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Password and Confirm Password DO NOT match. Renter",Toast.LENGTH_LONG).show();

                drpassword.setText("");
                drcnfpassword.setText("");
            }

        }
    });
    }
}
