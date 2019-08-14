package com.babykiller.freak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class illuminati4 extends AppCompatActivity {


    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illuminati4);

        TextView Txtname = (TextView) findViewById(R.id.Txtfirstname_4);
        TextView Txtfamily = (TextView) findViewById(R.id.TxtSecond_4);
        TextView TxtAge = (TextView) findViewById(R.id.Txtage_4);
        TextView TxtPhone = (TextView) findViewById(R.id.TxtPhoneNumber_4);
        TextView TxtAddress = (TextView) findViewById(R.id.TxtAddress_4);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String family = intent.getStringExtra("family");
        String age = intent.getStringExtra("age");
        String phone = intent.getStringExtra("phone");
        String address = intent.getStringExtra("address");


        Txtname.setText(name);
        Txtfamily.setText(family);
        TxtAge.setText(age);
        TxtPhone.setText(phone);
        TxtAddress.setText(address);


        Button btnVerifyPhoneNumber = (Button) findViewById(R.id.btnEdit_4);

        btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(illuminati4.this, illuminati3.class);
                startActivity(i);
                finish();
            }
        });

        Button btnConfirm = (Button) findViewById(R.id.btnConfirm_4);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

            // PreferenceManager.getDefaultSharedPreferences(this).edit()
//                .putString("username", username).apply();

        });


    }
}