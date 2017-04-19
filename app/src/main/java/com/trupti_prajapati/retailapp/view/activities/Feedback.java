package com.trupti_prajapati.retailapp.view.activities;

import android.Manifest;
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

public class Feedback extends AppCompatActivity {

    private static final int My_SMs=0;

    String feedback;
    String mno;
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
                    smsManager.sendTextMessage(mno,null,feedback,null,null);
                    Toast.makeText(getApplicationContext(),"Sms sent",Toast.LENGTH_SHORT).show();

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
        setContentView(R.layout.activity_feedback);

        final TextView ufeedback=(TextView)findViewById(R.id.backfeed);
        final EditText mobno=(EditText)findViewById(R.id.mobno);
        final EditText sms=(EditText)findViewById(R.id.msg);
        Button ok=(Button)findViewById(R.id.sendsms);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendSMSMessage();
            }

            protected void sendSMSMessage() {

                mno=mobno.getText().toString();
                smsmsg=sms.getText().toString();
                feedback=ufeedback.getText().toString();


                if (ContextCompat.checkSelfPermission(Feedback.this, Manifest.permission.SEND_SMS)
                        != PackageManager.PERMISSION_GRANTED);
                if (ActivityCompat.shouldShowRequestPermissionRationale(Feedback.this,Manifest.permission.SEND_SMS))
                {
                }
                else
                {
                    ActivityCompat.requestPermissions(Feedback.this,new String[]{Manifest.permission.SEND_SMS},My_SMs);
                }


            }
        });




    }
}



