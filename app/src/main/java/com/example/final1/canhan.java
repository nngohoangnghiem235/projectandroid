package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class canhan extends AppCompatActivity {
    TextView txtthongtintaikhoan;
    TextView txtdiachigiaohang,Tentoi;
    TextView txtcaidat, txtdangxuat;
    Button btnnhahag;
    Database database;
    String ten;

    ArrayList<taikhoanuser> arrayuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_canhan);
        database = new Database(this, "user.sqlite", null, 1);
        Cursor datauser = database.GetData("select * from thongtinuser2 where taikhoanuser = '"+dangnhap.tk+"'");
        while (datauser.moveToNext()) {
            ten = datauser.getString(3);

        txtthongtintaikhoan = (TextView) findViewById(R.id.thongtintaikhoan);
        txtdiachigiaohang =(TextView) findViewById(R.id.diachigiaohang);
        btnnhahag=(Button)findViewById(R.id.nhahang);
        txtcaidat = (TextView) findViewById(R.id.caidat);
        txtdangxuat=(TextView) findViewById(R.id.dangxuat);
        Tentoi =(TextView) findViewById(R.id.cn_toi);

        Tentoi.setText(ten);

        txtdangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(canhan.this, dangnhap.class);
                startActivity(intent);
            }
        });
        btnnhahag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentnhahang = new Intent(canhan.this, trangchu.class);
                startActivity(intentnhahang);
            }
        });
        txtthongtintaikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentthongtintaikhoan = new Intent(canhan.this, thongtintaikhoan2.class);
                startActivity(intentthongtintaikhoan);
            }
        });
        txtdiachigiaohang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentthemdiachimoi = new Intent(canhan.this, themdiachimoi.class);
                startActivity(intentthemdiachimoi);
            }
        });
        txtcaidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcaidat = new Intent(canhan.this, caidat.class);
                startActivity(intentcaidat);
            }
        });

    }


}}