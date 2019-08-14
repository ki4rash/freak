package com.babykiller.freak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class illuminati2 extends AppCompatActivity {

    private EditText editText_num;
    private ImageButton imageButton_dialer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_illuminati2);
        editText_num =(EditText) findViewById(R.id.edtCall);
        imageButton_dialer  = (ImageButton) findViewById(R.id.btncall);
        imageButton_dialer . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData (Uri.parse("tel:" + editText_num.getText().toString() ));
                startActivity(intent);
            }
        });


    }
}
