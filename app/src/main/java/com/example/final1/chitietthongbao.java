package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chitietthongbao extends AppCompatActivity {
    Button btnback,nhahagtctb, donhagtctb, canhantctb, tctb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_chitietthongbao);
        btnback = (Button) findViewById(R.id.back);
        nhahagtctb = (Button) findViewById(R.id.nhahangcttb);
        donhagtctb = (Button) findViewById(R.id.donhangcttb);
        canhantctb = (Button) findViewById(R.id.tktctb);
        tctb = (Button) findViewById(R.id.btntctb);

        tctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao.this, trangchu.class);
                startActivity(intent);
            }
        });
        nhahagtctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao.this, trangchu.class);
                startActivity(intent);
            }
        });
        donhagtctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao.this, trangchu.class);
                startActivity(intent);
            }
        });
        canhantctb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao.this, canhan.class);
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
