package com.example.cartmaxapperals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminRegistration extends AppCompatActivity {

    Button register, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_registration);

        back = (Button) findViewById(R.id.btnBackA);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminRegistration.this, AdminLogin.class);
                startActivity(intent);
            }
        });
    }
}