package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class thongbao extends AppCompatActivity {
    TextView tvChiTiet1,tvChiTiet2,tvChiTiet3;
    Button btnDelete, btnBack, btnTrangChu, btnDonHang, btnTaiKhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_thongbao);
        tvChiTiet1 = (TextView)findViewById(R.id.tvChiTiet1);
        tvChiTiet2 = (TextView)findViewById(R.id.tvChiTiet2);
        tvChiTiet3 = (TextView)findViewById(R.id.tvChiTiet3);
        btnBack = (Button) findViewById(R.id.btnBack) ;
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnTrangChu = (Button) findViewById(R.id.btnTrangChu);
        btnDonHang = (Button) findViewById(R.id.btnDonHang);
        btnTaiKhoan = (Button) findViewById(R.id.btnTaiKhoan);

        btnTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongbao.this, trangchu.class);
                startActivity(intent);
            }
        });
        btnDonHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongbao.this, ActivityDonHangFragment.class);
                startActivity(intent);
            }
        });
        btnTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongbao.this, canhan.class);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        tvChiTiet1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(thongbao.this, chitietthongbao.class);
                startActivity(intent);
            }
        });
        tvChiTiet2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(thongbao.this, chitietthongbao2.class);
                startActivity(intent);
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater li=getLayoutInflater();
                View layout=li.inflate(R.layout.activity_toast,(ViewGroup) findViewById(R.id.toast));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(layout);
                toast.show();
            }
        });

    }
}