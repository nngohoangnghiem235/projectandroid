package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dkthanhcong extends AppCompatActivity {
    Button btnTruyCap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dkthanhcong);
        btnTruyCap = (Button) findViewById(R.id.btnTruyCapNgay);
        btnTruyCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(dkthanhcong.this, dangnhap.class);
                startActivity(intent);
            }
        });
    }
}