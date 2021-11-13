package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class donhang extends AppCompatActivity {
    Button btn, btnback, thongbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_donhang);
        Button btnN = (Button) findViewById(R.id.btnNext);
        Button btn = (Button) findViewById(R.id.btnTHTT);
        Button btnback = (Button) findViewById(R.id.back);
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(donhang.this, second.class);
                startActivity(intent);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(donhang.this, second.class);
                startActivity(intent);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(donhang.this, trangchu.class);
                startActivity(intent);
            }
        });
    }
}