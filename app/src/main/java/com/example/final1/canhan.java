package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class canhan extends AppCompatActivity {
    TextView tvThongTinTaiKhoan,tvDiaChiGiaoHang,tvCaiDat,tvDangXuat;
    Button btnTrangChu,btnDonHang,btnThongBao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_canhan);
        tvThongTinTaiKhoan = (TextView) findViewById(R.id.tvThongTinTaiKhoan);
        tvDiaChiGiaoHang =(TextView) findViewById(R.id.tvDiaChiGiaoHang);
        btnTrangChu=(Button)findViewById(R.id.btnTrangChu);
        btnDonHang=(Button)findViewById(R.id.btnDonHang);
        btnThongBao=(Button)findViewById(R.id.btnThongBao);
        tvCaiDat = (TextView) findViewById(R.id.tvCaiDat);
        tvDangXuat=(TextView) findViewById(R.id.tvDangXuat);

        btnTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(canhan.this, trangchu.class);
                startActivity(intent);
            }
        });
        btnThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(canhan.this, thongbao.class);
                startActivity(intent);
            }
        });
        btnDonHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(canhan.this, ActivityDonHangFragment.class);
                startActivity(intent);
            }
        });
        tvDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(canhan.this, dangnhap.class);
                startActivity(intent);
            }
        });
        tvDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(canhan.this, trangchu.class);
                startActivity(intent);
            }
        });
        tvThongTinTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(canhan.this, thongtintaikhoan2.class);
                startActivity(intent);
            }
        });
        tvDiaChiGiaoHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(canhan.this, themdiachimoi.class);
                startActivity(intent);
            }
        });
        tvCaiDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(canhan.this, caidat.class);
                startActivity(intent);
            }
        });
    }
}