package com.example.minical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        if (getIntent().hasExtra("com.example.minical.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.about_statement);
            String text = getIntent().getExtras().getString("com.example.minical.SOMETHING");
            tv.setText(text);
        }
    }
}
