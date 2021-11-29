package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class dangnhap extends AppCompatActivity {
    Button btnDangNhap;
    TextView tvDangKi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dangnhap);
        btnDangNhap = (Button) findViewById(R.id.btnDangNhap);
        tvDangKi = (TextView) findViewById(R.id.tvDangKi);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangnhap.this, trangchu.class);
                startActivity(intent);
            }
        });
        tvDangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dangnhap.this, dangki.class);
                startActivity(intent);
            }
        });
    }
}