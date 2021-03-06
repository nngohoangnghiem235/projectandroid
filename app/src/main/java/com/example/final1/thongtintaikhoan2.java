package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class thongtintaikhoan2 extends AppCompatActivity {

    TextView txtcapnhatthongtin;
    TextView txtdoimatkhau;
    TextView txtdiachigiaohang,Tentoi;
    TextView txtcaidat;
    TextView txtthongtintaikhoan, txtdangxuat;
    String ten;
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_thongtintaikhoan2);
        txtcapnhatthongtin = (TextView) findViewById(R.id.capnhatthongtin);
        txtdoimatkhau = (TextView) findViewById(R.id.doimatkhau);
        txtdiachigiaohang =(TextView) findViewById(R.id.diachigiaohang);
        txtcaidat = (TextView) findViewById(R.id.caidat);
        txtthongtintaikhoan = (TextView) findViewById(R.id.thongtintaikhoan);
        txtdangxuat=(TextView)findViewById(R.id.dangxuat);
        Tentoi = (TextView)findViewById(R.id.cn_toi2);

        database = new Database(this, "user.sqlite", null, 1);
        Cursor datauser = database.GetData("select * from thongtinuser2 where taikhoanuser = '"+dangnhap.tk+"'");
        while (datauser.moveToNext()) {
            ten = datauser.getString(3);
            Tentoi.setText(ten);
        txtdangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongtintaikhoan2.this, dangnhap.class);
                startActivity(intent);
            }
        });
        txtcapnhatthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(thongtintaikhoan2.this, capnhatthongtin.class);
                startActivity(intent1);
            }
        });
        txtdoimatkhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(thongtintaikhoan2.this, doimatkhau.class);
                startActivity(intent2);
            }
        });
        txtdiachigiaohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentthemdiachimoi = new Intent(thongtintaikhoan2.this, themdiachimoi.class);
                startActivity(intentthemdiachimoi);
            }
        });
        txtcaidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcaidat = new Intent(thongtintaikhoan2.this, caidat.class);
                startActivity(intentcaidat);
            }
        });
        txtthongtintaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}}