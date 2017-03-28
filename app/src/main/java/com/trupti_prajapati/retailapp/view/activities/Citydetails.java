package com.trupti_prajapati.retailapp.view.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.trupti_prajapati.retailapp.R;

/**
 * Created by Lenovo on 24-03-2017.
 */
public class Citydetails extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
           setContentView(R.layout.citydetails);

        TextView tv=(TextView)findViewById(R.id.cityname);



    }
}
