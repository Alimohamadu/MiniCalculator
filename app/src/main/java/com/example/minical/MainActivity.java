package com.example.minical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button other =  (Button) findViewById(R.id.contact_btn);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ContactActivity.class);
                startActivity(startIntent);
            }
        });

        TextView contact =  (TextView) findViewById(R.id.about_textView);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ContactActivity.class);
                startIntent.putExtra("com.example.minical.SOMETHING", "Hello!");
                startActivity(startIntent);
            }
        });

        Button other_btn = (Button)findViewById(R.id.other);
        other_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String other = "http://www.google.com/playstore";
                Uri web_address = Uri.parse(other);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW,web_address);
                if (gotoGoogle.resolveActivity(getPackageManager()) !=  null) {
                    startActivity(gotoGoogle);
                }
            }
        });

        Button add_btn = (Button) findViewById(R.id.add_btn);
        final Button subtract_btn = (Button) findViewById(R.id.subtract_btn);
        Button multiply_btn = (Button) findViewById(R.id.multiply_btn);
        Button divide_btn = (Button) findViewById(R.id.divide_btn);

        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first_num = (EditText) findViewById(R.id.first_num);
                EditText second_num = (EditText) findViewById(R.id.second_num);
                TextView result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(first_num.getText().toString());
                int num2 = Integer.parseInt(second_num.getText().toString());
                int add = num1 + num2;
                result.setText(add + "");
            }
        });

        subtract_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first_num = (EditText) findViewById(R.id.first_num);
                EditText second_num = (EditText) findViewById(R.id.second_num);
                TextView result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(first_num.getText().toString());
                int num2 = Integer.parseInt(second_num.getText().toString());
                int subtract = num1 - num2;
                result.setText(subtract + "");
            }
        });

        multiply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first_num = (EditText) findViewById(R.id.first_num);
                EditText second_num = (EditText) findViewById(R.id.second_num);
                TextView result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(first_num.getText().toString());
                int num2 = Integer.parseInt(second_num.getText().toString());
                int multiply = num1 * num2;
                result.setText(multiply + "");
            }
        });

        divide_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first_num = (EditText) findViewById(R.id.first_num);
                EditText second_num = (EditText) findViewById(R.id.second_num);
                TextView result = (TextView) findViewById(R.id.result);

                int num1 = Integer.parseInt(first_num.getText().toString());
                int num2 = Integer.parseInt(second_num.getText().toString());
                int divide = num1 / num2;
                result.setText(divide + "");
            }
        });
    }
}
