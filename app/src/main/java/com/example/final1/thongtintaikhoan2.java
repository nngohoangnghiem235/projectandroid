package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thongtintaikhoan2 extends AppCompatActivity {

    TextView tvCapNhatThongTin,tvDoiMatKhau,tvDiaChiGiaoHang,tvDangXuat,tvCaiDat,tvThongTinTaiKhoan;
    Button btnTrangChu, btnDonHang,btnThongBao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_thongtintaikhoan2);
        btnTrangChu = (Button) findViewById(R.id.btnTrangChu);
        btnDonHang = (Button) findViewById(R.id.btnDonHang);
        btnThongBao = (Button) findViewById(R.id.btnThongBao);
        tvCapNhatThongTin = (TextView) findViewById(R.id.tvCapNhatThongTin);
        tvDoiMatKhau = (TextView) findViewById(R.id.tvDoiMatKhau);
        tvDiaChiGiaoHang =(TextView) findViewById(R.id.tvDiaChiGiaoHang);
        tvCaiDat = (TextView) findViewById(R.id.tvCaiDat);
        tvThongTinTaiKhoan = (TextView) findViewById(R.id.tvThongTinTaiKhoan);
        tvDangXuat=(TextView)findViewById(R.id.tvDangXuat);

        btnTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtintaikhoan2.this, trangchu.class);
                startActivity(intent);
            }
        });
        btnThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtintaikhoan2.this, thongbao.class);
                startActivity(intent);
            }
        });
        btnDonHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtintaikhoan2.this, ActivityDonHangFragment.class);
                startActivity(intent);
            }
        });
        tvDangXuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtintaikhoan2.this, dangnhap.class);
                startActivity(intent);
            }
        });
        tvCapNhatThongTin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(thongtintaikhoan2.this, capnhatthongtin.class);
                startActivity(intent1);
            }
        });
        tvDoiMatKhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(thongtintaikhoan2.this, doimatkhau.class);
                startActivity(intent2);
            }
        });
        tvDiaChiGiaoHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentthemdiachimoi = new Intent(thongtintaikhoan2.this, themdiachimoi.class);
                startActivity(intentthemdiachimoi);
            }
        });
        tvCaiDat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcaidat = new Intent(thongtintaikhoan2.this, caidat.class);
                startActivity(intentcaidat);
            }
        });
        tvThongTinTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}