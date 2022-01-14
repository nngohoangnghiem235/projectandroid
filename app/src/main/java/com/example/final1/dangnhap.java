package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class dangnhap extends AppCompatActivity {
    Button dnhap1;
    TextView tvdk;
    EditText taikhoan,matkhau;
    Database database;
    String tk,mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dangnhap);
        database = new Database(this, "user.sqlite", null, 1);
        database.QuerData("CREATE TABLE IF NOT EXISTS thongtinuser2(Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, taikhoanuser VARCHAR(200),matkhau VARCHAR(200)" +
                ",hoten VARCHAR(200),ngaythangnamsinh VARCHAR(200),email VARCHAR(200),gioitinh VARCHAR(200),sodienthoai VARCHAR(200),tinhthanh VARCHAR(200)" +
                ",quanhuyen VARCHAR(200),phuongxa VARCHAR(200),sonhatenduong VARCHAR(200) )");
        dnhap1 = (Button) findViewById(R.id.dnhap);
        tvdk = (TextView) findViewById(R.id.tvdangki);
        taikhoan =(EditText) findViewById(R.id.dn_tendn);
        matkhau = (EditText)findViewById(R.id.dn_mk);
        dnhap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor datauser = database.GetData("select * from thongtinuser2");
                while (datauser.moveToNext()) {
                    tk = datauser.getString(1);
                    mk = datauser.getString(2);

                }
                String a = taikhoan.getText().toString();
                String b = matkhau.getText().toString();
                if (a.equals(tk) && b.equals(mk) ){
                              Intent intent = new Intent(dangnhap.this, trangchu.class);
                startActivity(intent);
                }
                else {
                    Toast.makeText(dangnhap.this, "Sai tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show();
                }

            }
        });
        tvdk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangnhap.this, dangki.class);
                startActivity(intent);
            }
        });
    }
}