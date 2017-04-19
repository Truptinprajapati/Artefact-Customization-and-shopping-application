package com.trupti_prajapati.retailapp.view.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.trupti_prajapati.retailapp.AsyncTasks.AsyncResponse;
import com.trupti_prajapati.retailapp.AsyncTasks.WebserviceCall;
import com.trupti_prajapati.retailapp.R;
import com.trupti_prajapati.retailapp.pojo.PojoModel;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//    import com.example.modern.onlineshopping.AsyncTasks.AsyncResponse;
//    import com.example.modern.onlineshopping.AsyncTasks.WebserviceCall;
//    import com.example.modern.onlineshopping.pojo.PojoModel;

/**
 * Created by modern on 1/28/2017.
 */
public class Cashpayregistration extends AppCompatActivity {
    String URL ="http://development.ifuturz.com/core/FLAT_TEST/ecart_new/admin/webservice.php";
    String regexStr = "^[0-9]$";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        final EditText fnname=(EditText)findViewById(R.id.r_uname);
        final EditText address=(EditText)findViewById(R.id.r_address);
        final EditText email=(EditText)findViewById(R.id.r_email);
        final EditText pwd=(EditText)findViewById(R.id.r_pwd);
        //final EditText conpwd=(EditText)findViewById(R.id.r_confirmpwd);
        final EditText mobno=(EditText)findViewById(R.id.r_mobno);
        //final TextView gender=(TextView)findViewById(R.id.gender_textview);
        // final RadioButton male=(RadioButton)findViewById(R.id.male_radiobutton);
        //final RadioButton female=(RadioButton)findViewById(R.id.female_radiobutton);
        Button submit=(Button)findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //                new WebserviceCall(Registration.this, URL, null, "Loading...", true, new AsyncResponse() {
                //                    @Override
                //                    public void onCallback(String response) {
                //                        Log.d("myapp",response);
                //                        PojoModel model=new Gson().fromJson(response,PojoModel.class);
                //                        Log.d("myapp",model.getMessage());
                //                        List<PojoModel.UserDetailBean> list= (List<PojoModel.UserDetailBean>) model.getUserDetail();
                //                    }
                //                }).execute();


                String strfname = fnname.getText().toString();
                String straddress = address.getText().toString();
                String stremail = email.getText().toString();
                String strpwd = pwd.getText().toString();
                // String strconpwd = conpwd.getText().toString();
                //String strgender = gender.getText().toString();
                String strmob = mobno.getText().toString();

                //if(mobno.getText().toString().length()<10 || strmob.length()>13 || strmob.matches(regexStr)==false  )
                //
                if (strmob.isEmpty()){
                    Toast.makeText(Cashpayregistration.this,"Please enter mobile number",Toast.LENGTH_SHORT).show();
                    // am_checked=0;
                }



                //                {
                //                    if (male.isChecked()) {
                //                        male.getText().toString();
                //                    } else {
                //                        female.getText().toString();
                //                    }
                //
                //                }


                if (strfname.isEmpty()) {
                    Toast.makeText(Cashpayregistration.this, "Name cannot be empty!", Toast.LENGTH_SHORT).show();

                } else if (straddress.isEmpty()) {
                    Toast.makeText(Cashpayregistration.this, "addres cannot be empty", Toast.LENGTH_SHORT).show();

                } else if (stremail.isEmpty()) {
                    Toast.makeText(Cashpayregistration.this, "Enter email", Toast.LENGTH_SHORT).show();
                } else if (!isValidEmail(stremail)) {
                    Toast.makeText(Cashpayregistration.this, "Enter valid email", Toast.LENGTH_SHORT).show();
                } else if (strpwd.isEmpty()) {
                    Toast.makeText(Cashpayregistration.this, "please enter password", Toast.LENGTH_SHORT).show();
                }
                //                else if (strconpwd.isEmpty()) {
                //                    Toast.makeText(Registration.this, "please enter confirm password", Toast.LENGTH_SHORT).show();
                //                }
               // else if (strmob.isEmpty()) {
                 //   Toast.makeText(Cashpayregistration.this, "please enter contact number", Toast.LENGTH_SHORT).show();
                //}
                //                else if (strgender.isEmpty()) {
                //                    Toast.makeText(Registration.this, "enter your gender", Toast.LENGTH_SHORT).show();
                //                } else if (!strpwd.equals(strconpwd)) {
                //                    Toast.makeText(Registration.this, "passwords don't match", Toast.LENGTH_SHORT).show();

                //    }










                else {
                    JSONObject object = new JSONObject();
                    try {
                        object.put("mode","Register");
                        object.put("userName", strfname);
                        object.put("emailId", stremail);
                        object.put("address", straddress);
                        object.put("password", strpwd);
                        //object.put("confirmpassword", strconpwd);
                        //object.put("gender", gender);
                        object.put("contactNumber", strmob);


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    String jsonRequest = String.valueOf(object);
                    Log.d("myapp","Request: "+jsonRequest);
                    // String URL = "http://www.vnurture.in/pro/registration.php";
                    String URL ="http://development.ifuturz.com/core/FLAT_TEST/ecart_new/admin/webservice.php";


                    new WebserviceCall(Cashpayregistration.this, URL, jsonRequest, "LOadding...", true, new AsyncResponse() {

                        @Override
                        public void onCallback(String response) {

                            Log.d("myapp",response);
                            PojoModel pm=new Gson().fromJson(response,PojoModel.class);
                            if (pm.getStatus()==1)
                            {
                                Log.d("myapp",pm.getMessage());


                                Intent i = new Intent(Cashpayregistration.this,Cashpaylog.class);
                                startActivity(i);

                                Toast.makeText(getApplicationContext(),"suceess",Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                Toast.makeText(getApplicationContext(),"Try agin",Toast.LENGTH_SHORT).show();
                            }
                        }



                    }).execute();


                }





            }
        });


    }

    private boolean isValidEmail(String stremail) {
        Pattern pattern;
        Matcher matcher;
        final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(stremail);
        return matcher.matches();
    }
}






