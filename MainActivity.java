package com.example.abans_000.docplus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.microsoft.windowsazure.mobileservices.http.ServiceFilterResponse;
import com.microsoft.windowsazure.mobileservices.table.TableOperationCallback;


public class MainActivity extends ActionBarActivity {
    DBHandleDr dbHandleDr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHandleDr = new DBHandleDr(this,null,null,1);
        Button b = (Button) findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignOther = new Intent(MainActivity.this, SignOthers.class);
                startActivity(SignOther);
            }
        });

        Button b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DrSignUp = new Intent(MainActivity.this,DrSignUp.class);
                startActivity(DrSignUp);
            }
        });

        Button b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Emergency1 = new Intent(MainActivity.this,Emergency1.class);
                startActivity(Emergency1);
            }
        });

        Button login = (Button) findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText musername = (EditText) findViewById(R.id.editText);
                EditText mpassword = (EditText) findViewById(R.id.editText2);
                String username = musername.getText().toString();
                String password = mpassword.getText().toString();
                if(!username.equals(""))
                {
                    //ReturnDr retval;
                    String dbString;
                    dbString = dbHandleDr.validLogin(username,password);
                    if(dbString.equals(""))
                    {
                        Toast.makeText(MainActivity.this, "Username and Password DO NOT match", Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Intent i = new Intent(MainActivity.this,ProfileDr.class);
                        i.putExtra("dbString",dbString);
                        startActivity(i);
                    }
                    /*if(retval.is_stat())
                    {
                        Intent i = new Intent(MainActivity.this,ProfileDr.class);
                        i.putExtra("name",retval.get_name());
                        i.putExtra("age",retval.get_age());
                        i.putExtra("mobile",retval.get_mobile());
                        i.putExtra("sex",retval.get_sex());
                        startActivity(i);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Username and Password DO NOT match", Toast.LENGTH_LONG).show();
                    }*/
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Username can't be empty", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}
