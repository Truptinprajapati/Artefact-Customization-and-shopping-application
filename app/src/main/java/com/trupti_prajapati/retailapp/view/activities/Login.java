package com.trupti_prajapati.retailapp.view.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.trupti_prajapati.retailapp.AsyncTasks.AsyncResponse;
import com.trupti_prajapati.retailapp.AsyncTasks.WebserviceCall;
import com.trupti_prajapati.retailapp.R;
import com.trupti_prajapati.retailapp.pojo.Pojoforgot;
import com.trupti_prajapati.retailapp.pojo.Pojologin;

import org.json.JSONException;
import org.json.JSONObject;

public class Login extends AppCompatActivity {
    String URL ="http://development.ifuturz.com/core/FLAT_TEST/ecart_new/admin/webservice.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText email=(EditText)findViewById(R.id.logemail);
        final   EditText pwd=(EditText)findViewById(R.id.logpwd);
        TextView lsignup=(TextView)findViewById(R.id.signup);
        TextView lforgotpwd=(TextView)findViewById(R.id.forgotpwd);
        Button login =(Button)findViewById(R.id.login);
        View dialogView;




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {








                String stremail=email.getText().toString();
                String strpwd=pwd.getText().toString();

                if (stremail.isEmpty())

                {
                    Toast.makeText(Login.this, "Email cannot be empty!", Toast.LENGTH_SHORT).show();

                } else if (strpwd.isEmpty())

                {
                    Toast.makeText(Login.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();

                } else

                {JSONObject object = new JSONObject();
                    try {
                        object.put("mode","loginUser");
                        object.put("emailId", stremail);
                        object.put("password", strpwd);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    String jsonRequest = String.valueOf(object);

//                    String URL = "http://www.vnurture.in/pro/login.php";
                    String URL ="http://development.ifuturz.com/core/FLAT_TEST/ecart_new/admin/webservice.php";




                    new WebserviceCall(Login.this, URL, jsonRequest, "Loading...", true, new AsyncResponse() {
                        @Override
                        public void onCallback(String response) {
                            Log.d("myapp",response);
                            Pojologin pojologin=new Gson().fromJson(response,Pojologin.class);
                            if (pojologin.getStatus()==1)
                            {
                                Log.d("myapp",pojologin.getMessage());
                                Intent i = new Intent(Login.this,ECartHomeActivity.class);
                                startActivity(i);
                            }




                        }
                    }).execute();


                }


            }
        });


        lsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent in=new Intent(getApplicationContext(),Registration.class);
                startActivity(in);

                Toast.makeText(getApplicationContext(),"signup",Toast.LENGTH_SHORT).show();
            }
        });




//        lforgotpwd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(Login.this,Forgotpassword.class);
//                startActivity(i);
//            }
//        });






        lforgotpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showForgotPasswordDialog();

            }



        });


    }

    private void showForgotPasswordDialog() {
        final View dialogView= LayoutInflater.from(this).inflate(R.layout.dailog_forgot_pwd,null);
        AlertDialog ad=new AlertDialog.Builder(this)
                .setTitle("Email")
                .setView(dialogView)
                .setPositiveButton("Verify", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handleDialog(dialogView);
                        dialog.dismiss();


                    }

                    private void handleDialog(View dialogView) {
                        EditText verifyEmailET = (EditText) dialogView.findViewById(R.id.forgot_et_email);
                        String stremail = verifyEmailET.getText().toString();
                        JSONObject object = new JSONObject();
                        try {
                            object.put("mode","forgotPassword");
                            object.put("emailId", stremail);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        String jsonRequest = String.valueOf(object);

                        String URL ="http://development.ifuturz.com/core/FLAT_TEST/ecart_new/admin/webservice.php";
                        // String URL = "http://www.vnurture.in/pro/mailtest.php";



                        new WebserviceCall(Login.this, URL, jsonRequest, "Loading...", true, new AsyncResponse() {
                            @Override
                            public void onCallback(String response) {
                                Log.d("myapp",response);
                                Pojoforgot pf=new Gson().fromJson(response,Pojoforgot.class);
                                if (pf.getStatus()==1)
                                {
                                    Log.d("myapp",pf.getMessage());
                                    Toast.makeText(getApplicationContext(),"your messges sent Email",Toast.LENGTH_SHORT).show();

                                    Intent i = new Intent(Login.this,ECartHomeActivity.class);
                                    startActivity(i);
                                }

                                else {
                                    Toast.makeText(getApplicationContext(),"Try agin",Toast.LENGTH_SHORT).show();
                                }



                            }
                        }).execute();

                    }


                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        ad.show();


    }
}
