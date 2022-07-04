package com.example.cartmaxapperals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerLogin extends AppCompatActivity {

    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);

        register = (Button) findViewById(R.id.registerCL);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerLogin.this, CustomerRegistration.class);
                startActivity(intent);
            }
        });
    }
}