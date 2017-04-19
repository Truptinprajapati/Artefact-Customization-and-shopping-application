package com.trupti_prajapati.retailapp.view.activities;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.trupti_prajapati.retailapp.R;

public class Payment extends AppCompatActivity {
    final Context context = this;


    private final int time=50000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);




        Thread timerThread =new Thread()
        {
            public void run(){
                try{
                    sleep(50000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();

                }
                finally {
                    Intent i=new Intent(Payment.this,ECartHomeActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };

        timerThread.start();









        TextView feedback=(TextView)findViewById(R.id.feedback);


        Button cash=(Button)findViewById(R.id.cash_payment);

        Button credit=(Button)findViewById(R.id.creaditcard);



        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Payment.this,Feedback.class);
                startActivity(i);
            }
        });


        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set title
                alertDialogBuilder.setTitle("Cash on Delivary");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Click yes to exit!")
                        .setCancelable(false)
                        .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity

                               //Payment.this.finish();
                                //Intent i=new Intent(Payment.this, Cashpayment.class);
                                //startActivity(i);
                            }
                        })
                        .setNegativeButton("No",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing



                                Intent i=new Intent(Payment.this,Mycasepayment.class);
                                startActivity(i);
                                //dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();







            }
        });





        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(Payment.this,Paypal_webview.class);
                startActivity(i);

            }
        });
    }
}
