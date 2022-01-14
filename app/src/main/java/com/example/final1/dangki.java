package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.ServerSocket;


public class dangki extends AppCompatActivity {
    EditText taikhoan, matkhau,hoten,sdt;
    Button bntdk;
    Database database;
    String Staikhoan,Smatkhau,Shoten,Ssdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dangki);
        taikhoan = (EditText) findViewById(R.id.dk_tendn);
        matkhau = (EditText)findViewById(R.id.dk_mk);
        hoten  = (EditText)findViewById(R.id.dk_hoten);
        sdt = (EditText)findViewById(R.id.dk_sdt);
        bntdk = (Button) findViewById(R.id.bntdangki);


        database = new Database(this, "user.sqlite", null, 1);
        // tao bang
        database.QuerData("CREATE TABLE IF NOT EXISTS thongtinuser2(Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, taikhoanuser VARCHAR(200),matkhau VARCHAR(200)" +
                ",hoten VARCHAR(200),ngaythangnamsinh VARCHAR(200),email VARCHAR(200),gioitinh VARCHAR(200),sodienthoai VARCHAR(200),tinhthanh VARCHAR(200)" +
                ",quanhuyen VARCHAR(200),phuongxa VARCHAR(200),sonhatenduong VARCHAR(200) )");


        bntdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Shoten = hoten.getText().toString();
                Staikhoan = taikhoan.getText().toString();
                Smatkhau = matkhau.getText().toString();
                Ssdt  = sdt.getText().toString();
                database.QuerData("INSERT into thongtinuser2 (hoten,taikhoanuser,matkhau,sodienthoai) VALUES ('"+Shoten+"','"+Staikhoan+"','"+Smatkhau+"','"+Ssdt+"')");



                Intent intent = new Intent(dangki.this, dkthanhcong.class);
                startActivity(intent);
            }
        });
    }
}