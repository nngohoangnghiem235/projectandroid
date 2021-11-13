package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lichsu extends AppCompatActivity {
    Button ddback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_lichsu);
        ddback = (Button) findViewById(R.id.btnDangDen);

        ddback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(lichsu.this, donhangpr.class);
                startActivity(intent1);
            }
        });

    }
}