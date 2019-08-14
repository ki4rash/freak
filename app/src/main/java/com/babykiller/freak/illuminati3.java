package com.babykiller.freak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class illuminati3 extends AppCompatActivity {


    private Button button_review;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illuminati3);
        Button btnVerifyPhoneNumber = (Button) findViewById(R.id.BtnReview_3);






        final EditText EdtName = (EditText) findViewById(R.id.EdtName_3);
        final EditText EdtFamily = (EditText) findViewById(R.id.EdtFamily_3);
        final EditText EdtAge = (EditText) findViewById(R.id.EdtAge_3);
        final EditText EdtPHONE = (EditText) findViewById(R.id.EdtPhone_3);
        final EditText EdtAddress = (EditText) findViewById(R.id.EdtAddress_3);

        btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = EdtName.getText().toString();
                String family = EdtFamily.getText().toString();
                String age= EdtAge.getText().toString();
                String phone= EdtPHONE.getText().toString();
                String address = EdtAddress.getText().toString();

                Intent intent = new Intent(illuminati3.this, illuminati4.class);
                intent.putExtra("name",name);
                intent.putExtra("family",family);
                intent.putExtra("age",age);
                intent.putExtra("phone",phone);
                intent.putExtra("address",address);






                startActivityForResult(intent, 150);


            }
        });
    }


}
