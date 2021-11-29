package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chitietthongbao2 extends AppCompatActivity {
    Button btnBack,btnTrangChu, btnDonHang, btnTaiKhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_chitietthongbao2);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnTrangChu = (Button) findViewById(R.id.btnTrangChu);
        btnDonHang = (Button) findViewById(R.id.btnDonHang);
        btnTaiKhoan = (Button) findViewById(R.id.btnTaiKhoan);


        btnTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao2.this, trangchu.class);
                startActivity(intent);
            }
        });
        btnDonHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao2.this, ActivityDonHangFragment.class);
                startActivity(intent);
            }
        });
        btnTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(chitietthongbao2.this, canhan.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}