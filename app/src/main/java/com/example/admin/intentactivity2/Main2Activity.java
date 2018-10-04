package com.example.admin.intentactivity2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String sname=getIntent().getStringExtra("NAME");
        String email=getIntent().getStringExtra("EMAIL");
        String srnum=getIntent().getStringExtra("RNUMBER");
        String snum=getIntent().getStringExtra("NUMBER");
        t1=(TextView)findViewById(R.id.txt1);
        t1.setText(sname+"\n"+email+"\n"+srnum+"\n"+snum);
    }
}
