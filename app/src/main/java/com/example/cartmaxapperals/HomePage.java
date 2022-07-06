package com.example.cartmaxapperals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    Button admin, customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        admin = (Button) findViewById(R.id.btnadmin);
        customer = (Button) findViewById(R.id.btncustomer);

        //home to admin login
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, AdminLogin.class);
                startActivity(intent);
            }
        });

        //home to customer login
        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this, CustomerLogin.class);
                startActivity(intent);
            }
        });
    }
}