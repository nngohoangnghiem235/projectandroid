package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class dangki extends AppCompatActivity {

    Button bntdk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dangki);

        bntdk = (Button) findViewById(R.id.bntdangki);
        bntdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangki.this, dkthanhcong.class);
                startActivity(intent);
            }
        });
    }
}