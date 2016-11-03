package com.example.abans_000.docplus;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import com.microsoft.windowsazure.mobileservices.*;
import com.microsoft.windowsazure.mobileservices.http.ServiceFilterResponse;
import com.microsoft.windowsazure.mobileservices.table.TableOperationCallback;


import org.apache.commons.logging.Log;


public class SignOthers extends ActionBarActivity {
    private MobileServiceClient mClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_others);

        EditText otname = (EditText) findViewById(R.id.otname);

        RadioGroup otradiogp = (RadioGroup) findViewById(R.id.otradiogp);
        int checked = otradiogp.getCheckedRadioButtonId();


        /*mClient = new MobileServiceClient(
                "https://docplus.azurewebsites.net",
                this
        );

        OthersSignUp item = new OthersSignUp();
        item.Name= "Ayush";
        mClient.getTable(OthersSignUp.class).insert(item, new TableOperationCallback<OthersSignUp>() {
            @Override
            public void onCompleted(OthersSignUp othersSignUp, Exception e1, ServiceFilterResponse serviceFilterResponse) {
                if(e1==null)
                {

                }
                else
                {

                }
            }
        }); */

    }
}
