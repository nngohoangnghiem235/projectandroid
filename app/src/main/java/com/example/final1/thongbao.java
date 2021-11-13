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
    TextView xem;
    TextView xem1;
    TextView xem2;
    Button btn, b, nhahagtb, donhagtb, canhantb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_thongbao);
        xem = (TextView)findViewById(R.id.txtxem);
        xem1 = (TextView)findViewById(R.id.txtxem1);
        xem2 = (TextView)findViewById(R.id.txtxem2);
        b = (Button) findViewById(R.id.back) ;
        btn = (Button) findViewById(R.id.btndelete);
        nhahagtb = (Button) findViewById(R.id.nhahangtb);
        donhagtb = (Button) findViewById(R.id.donhangtb);
        canhantb = (Button) findViewById(R.id.tktb);

        nhahagtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongbao.this, trangchu.class);
                startActivity(intent);
            }
        });
        donhagtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongbao.this, donhangpr.class);
                startActivity(intent);
            }
        });
        canhantb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thongbao.this, canhan.class);
                startActivity(intent);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        xem.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intenttxtxem = new Intent(thongbao.this, chitietthongbao.class);
                startActivity(intenttxtxem);
            }
        });
        xem1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intenttxtxem1 = new Intent(thongbao.this, chitietthongbao2.class);
                startActivity(intenttxtxem1);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
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