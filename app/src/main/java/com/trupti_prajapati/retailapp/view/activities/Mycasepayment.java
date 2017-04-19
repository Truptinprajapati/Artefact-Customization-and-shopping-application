package com.trupti_prajapati.retailapp.view.activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.trupti_prajapati.retailapp.R;

public class Mycasepayment extends AppCompatActivity {

    private static final int My_SMs=0;
    //String esms;
    String text;
    String uname;
    String mno;
    String email;
    String smsmsg;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode)
        {
            case My_SMs:
            {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    SmsManager smsManager=SmsManager.getDefault();
                    smsManager.sendTextMessage(mno,null,text,null,null);
                    Toast.makeText(getApplicationContext(),"your order confirm",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Mycasepayment.this,ECartHomeActivity.class);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Sms faild,please try again",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        }

    }









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycasepayment);

        final TextView corder=(TextView)findViewById(R.id.order);
        corder.setText("Your confirm Order Place?");
            //final EditText edsms=(EditText)findViewById(R.id.editsms);
       // edsms.setText("your Order confirm?");
       // edsms.setTextColor(Color.RED);
        final EditText usname=(EditText)findViewById(R.id.username);
        final EditText mobno=(EditText)findViewById(R.id.mobileno);
        final EditText uemail=(EditText)findViewById(R.id.email);
        final EditText address=(EditText)findViewById(R.id.address);
       // address.setText("Your confirm order place?");
        Button ok=(Button)findViewById(R.id.confirmorder);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendSMSMessage();
            }

            protected void sendSMSMessage() {

                text=corder.getText().toString();
                uname=usname.getText().toString();
                mno=mobno.getText().toString();
                email=uemail.getText().toString();
                smsmsg=address.getText().toString();
               // esms=edsms.getText().toString();



                if (ContextCompat.checkSelfPermission(Mycasepayment.this, Manifest.permission.SEND_SMS)
                        != PackageManager.PERMISSION_GRANTED);
                if (ActivityCompat.shouldShowRequestPermissionRationale(Mycasepayment.this,Manifest.permission.SEND_SMS))
                {
                }
                else
                {
                    ActivityCompat.requestPermissions(Mycasepayment.this,new String[]{Manifest.permission.SEND_SMS},My_SMs);
                }


            }
        });




    }
}