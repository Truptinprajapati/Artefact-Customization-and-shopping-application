package com.trupti_prajapati.retailapp.view.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.trupti_prajapati.retailapp.R;

/**
 * Created by Lenovo on 24-03-2017.
 */
public class Storeloactor extends AppCompatActivity{
    String Gujrat[]={"Ahmedabad","Broda","Gandhinagar","Surat"};
    String Rajashthan[]={"jodpur","jaipur","udepur","Kota"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storeloctor);
        Spinner country=(Spinner)findViewById(R.id.country);
        Spinner sp=(Spinner)findViewById(R.id.sp1);
        final ListView lv=(ListView)findViewById(R.id.lv1);
       final TextView citya=(TextView)findViewById(R.id.citya);
        final TextView cityb=(TextView)findViewById(R.id.cityb);
        String countrydetails[]=getResources().getStringArray(R.array.countrydetails);
        String state[]=getResources().getStringArray(R.array.state);

        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,state);
        sp.setAdapter(ad);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String item =parent.getItemAtPosition(position).toString();
                switch (position)
                {
                    case 0:
                        ArrayAdapter<String> ad1=new ArrayAdapter<String>(Storeloactor.this,android.R.layout.simple_list_item_1,Gujrat);
                        lv.setAdapter(ad1);
                        break;

                    case 1:
                        ArrayAdapter<String> ad2=new ArrayAdapter<String>(Storeloactor.this,android.R.layout.simple_list_item_1,Rajashthan);
                        lv.setAdapter(ad2);


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String item =parent.getItemAtPosition(position).toString();
                switch (position) {
                    case 0:
                        Intent i = new Intent(Storeloactor.this, Citydetails.class);
                        startActivity(i);

                        break;

                }
//                        citya.setText("Name:Ashram Road"+"\n"+
//                                " Ground Floor, Sharad Shopping Centre,"+"\n"+"Nr.Chinubhai Tower, Opp. Hand Loom House,"+
//                                "\n"+" Ashram Road, Ahmedaba");
//
//                        cityb.setText("Unit No. 1, Ground Floor, Binori Ambit,"+"\n"+
//                                " Old Survey No. 23, Final Plot No. 156 paiki of Town Planning Scheme No. 38,"+"\n"+
//                                " S. G. Highway, Near Muktidham Jain Derasar, Thaltej Cross Road, Moje Thaltej, Taluka Dascroi,"+
//                                "\n"+"AHMEDABAD, GUJARAT ");



            }

        });


    }
}
