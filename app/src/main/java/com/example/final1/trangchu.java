package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class trangchu extends AppCompatActivity {
        Button dath,dath1, taikhoan, tb, thayd, dhpr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_trangchu);

        dath = (Button) findViewById(R.id.dathang);
        dath1 =(Button) findViewById(R.id.dathang1);
        taikhoan = (Button) findViewById(R.id.tk);
        tb = (Button) findViewById(R.id.thongbao);

        thayd = (Button) findViewById(R.id.thaydoi);
        dhpr = (Button) findViewById(R.id.dh);


        dhpr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this, donhangpr.class);
                startActivity(intent);
            }
        });
        thayd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this, themdiachimoi.class);
                startActivity(intent);
            }
        });
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this, thongbao.class);
                startActivity(intent);
            }
        });
        taikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this, canhan.class);
                startActivity(intent);
            }
        });

        dath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this, donhang.class);
                startActivity(intent);
            }
        });

        dath1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(trangchu.this, donhang.class);
                startActivity(intent);
            }
        });

    }
}