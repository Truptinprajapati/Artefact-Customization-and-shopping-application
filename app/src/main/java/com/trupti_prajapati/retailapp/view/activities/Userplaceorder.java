package com.trupti_prajapati.retailapp.view.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.trupti_prajapati.retailapp.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userplaceorder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userplaceorder);


        final EditText ouname=(EditText)findViewById(R.id.username);
        final EditText omobno=(EditText)findViewById(R.id.mobileno);
        final EditText oemail=(EditText)findViewById(R.id.email);
        final EditText oaddress=(EditText)findViewById(R.id.address);

        Button oconf=(Button)findViewById(R.id.confirmorder);

        oconf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String couname=ouname.getText().toString();
                String comobno=omobno.getText().toString();
                String coemail=oemail.getText().toString();
                String coaddress=oaddress.getText().toString();


                if (couname.isEmpty()){

                    Toast.makeText(getApplication(),"username cannot empty",Toast.LENGTH_SHORT).show();
                }
               else if (comobno.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"mobile number cannot empty",Toast.LENGTH_SHORT).show();
                }
               else if (coaddress.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"address cannot empty",Toast.LENGTH_SHORT).show();
                }

                else if (coemail.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"email cannot empty",Toast.LENGTH_SHORT).show();
                }
                else if (!isValidEmail(coemail))
                {
                    Toast.makeText(getApplicationContext(),"valid email",Toast.LENGTH_SHORT).show();
                }

                Intent i=new Intent(Userplaceorder.this,Payment.class);
                startActivity(i);
            }

            private boolean isValidEmail(String coemail) {
                Pattern pattern;
                Matcher matcher;
                final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                pattern = Pattern.compile(EMAIL_PATTERN);
                matcher = pattern.matcher(coemail);
                return matcher.matches();
            }



        });



    }
}
