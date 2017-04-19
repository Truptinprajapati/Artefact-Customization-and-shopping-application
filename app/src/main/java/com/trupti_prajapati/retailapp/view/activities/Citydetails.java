package com.trupti_prajapati.retailapp.view.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.trupti_prajapati.retailapp.R;

/**
 * Created by Lenovo on 24-03-2017.
 */
public class Citydetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
           setContentView(R.layout.citydetails);

        TextView tv=(TextView)findViewById(R.id.cityname);


        tv.setText("Name:Ashram Road"+"\n"+
                              " Ground Floor, Sharad Shopping Centre,"+"\n"+"Nr.Chinubhai Tower, Opp. Hand Loom House,"+
                                "\n"+" Ashram Road, Ahmedaba");
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Citydetails.this, ECartHomeActivity.class);
                startActivity(i);
            }
        });




    }
}
