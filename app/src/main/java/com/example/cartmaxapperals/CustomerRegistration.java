package com.example.cartmaxapperals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerRegistration extends AppCompatActivity {

    Button register, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_registration);

        register = (Button) findViewById(R.id.btnRegisterC);
        back = (Button) findViewById(R.id.btnBackC);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerRegistration.this, CustomerLogin.class);
                startActivity(intent);
            }
        });
    }
}