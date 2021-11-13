package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chitietthongbao2 extends AppCompatActivity {
    Button btnback,nhahagtctb2, donhagtctb2, canhantctb2, tctb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_chitietthongbao2);
        btnback = (Button) findViewById(R.id.back);
        nhahagtctb2 = (Button) findViewById(R.id.nhahangcttb2);
        donhagtctb2 = (Button) findViewById(R.id.donhangcttb2);
        canhantctb2 = (Button) findViewById(R.id.tktctb2);
        tctb2 = (Button) findViewById(R.id.btntctb2);

        tctb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao2.this, trangchu.class);
                startActivity(intent);
            }
        });
        nhahagtctb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao2.this, trangchu.class);
                startActivity(intent);
            }
        });
        donhagtctb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao2.this, trangchu.class);
                startActivity(intent);
            }
        });
        canhantctb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao2.this, canhan.class);
                startActivity(intent);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}