package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class donhang extends AppCompatActivity {
    Button  btnBack,btnTiepTucMuaHang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_donhang);
        Button btnTienHanhThanhToan = (Button) findViewById(R.id.btnTienHanhThanhToan);
        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnTiepTucMuaHang = (Button) findViewById(R.id.btnTiepTucMuaHang);
        btnTienHanhThanhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(donhang.this, second.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(donhang.this, trangchu.class);
                startActivity(intent);
            }
        });
        btnTiepTucMuaHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(donhang.this, trangchu.class);
                startActivity(intent);
            }
        });
    }
}