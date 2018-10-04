package com.example.admin.intentactivity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    public final Pattern EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9+._%-+]{1,256}" +
                    "@" +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" +
                    "." +
                    "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}"

    );

    Button b1;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sname=e1.getText().toString();
                String email=e2.getText().toString();
                String srnum=e3.getText().toString();
                String snum=e4.getText().toString();
                if(sname.length()==0) {
                    e1.setError("inavalid name");
                }
                    else if(checkmail(email)) {
                    e2.setError("invalid email");
                }
                        else if(srnum.length() == 0) {
                    e3.setError("invalid registration number");
                }
                            else if(snum.length() == 0) {
                                e4.setError("Invalid number");
                            }



                else {


                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    //i.putExtra("NAME", sname);
                    //i.putExtra("EMAIL", email);
                    //i.putExtra("RNUMBER", srnum);
                    //i.putExtra("NUMBER", snum);
                    startActivity(i);
                }

            }
        });
    }

    private boolean checkmail(String email) {
        return EMAIL_ADDRESS_PATTERN.matcher(email).matches();
    }
}

