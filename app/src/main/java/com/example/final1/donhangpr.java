package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class donhangpr extends AppCompatActivity {
    Button lsB, nhB, tbB, tkB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getSupportActionBar().hide();
        setContentView(R.layout.activity_donhangpr);
        lsB = (Button) findViewById(R.id.btnLichSu);
        nhB = (Button) findViewById(R.id.nhahang);
        tbB = (Button) findViewById(R.id.thongbao1);
        tkB = (Button) findViewById(R.id.taik);

        nhB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(donhangpr.this, trangchu.class);
                startActivity(intent1);
            }
        });
        tbB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(donhangpr.this, thongbao.class);
                startActivity(intent1);
            }
        });
        tkB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(donhangpr.this, canhan.class);
                startActivity(intent1);
            }
        });
        lsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(donhangpr.this, lichsu.class);
                startActivity(intent1);
            }
        });
    }
}