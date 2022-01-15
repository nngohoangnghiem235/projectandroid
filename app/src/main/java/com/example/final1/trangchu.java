package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class trangchu extends AppCompatActivity {
        Button dath,dath1, taikhoan, tb, thayd, dhpr, combo2, combo3;
        TextView diachi;
        Database database;
    String Sten,Sphuongxa,Squanhuyen,Ssonha,Stinhthanh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_trangchu);
        database = new Database(this, "user.sqlite", null, 1);
        dath = (Button) findViewById(R.id.dathang);
        dath1 =(Button) findViewById(R.id.dathang1);
        taikhoan = (Button) findViewById(R.id.tk);
        tb = (Button) findViewById(R.id.thongbao);

        thayd = (Button) findViewById(R.id.thaydoi);
        dhpr = (Button) findViewById(R.id.dh);
        combo2 = (Button)findViewById(R.id.cb2);
        combo3 = (Button)findViewById(R.id.cb3);
        diachi = (TextView)findViewById(R.id.tc_diachi);


        Cursor datauser = database.GetData("select * from thongtinuser2 where taikhoanuser = '"+dangnhap.tk+"'");
        while (datauser.moveToNext()) {
            Sten = datauser.getString(3);
            Stinhthanh = datauser.getString(8);
            Squanhuyen = datauser.getString(9);
            Sphuongxa = datauser.getString(10);
            Ssonha = datauser.getString(11);
            Sten = Ssonha+" , " + Sphuongxa+" , " + Squanhuyen+" , " + Stinhthanh;

        }
        diachi.setText(Sten);


        combo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcb2 = new Intent(trangchu.this, combo_nhom.class);
                startActivity(intentcb2);
            }
        });
        combo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcb2 = new Intent(trangchu.this, cb_uudai.class);
                startActivity(intentcb2);
            }
        });
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