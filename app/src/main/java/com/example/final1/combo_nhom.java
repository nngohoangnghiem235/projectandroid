package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class combo_nhom extends AppCompatActivity {
    Button combo1, combo3,dath,dath1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo_nhom);
        combo1 = (Button)findViewById(R.id.cb1);
        combo3 = (Button)findViewById(R.id.cb3);
        dath = (Button) findViewById(R.id.dathang);
        dath1 =(Button) findViewById(R.id.dathang1);
        combo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcb1 = new Intent(combo_nhom.this, trangchu.class);
                startActivity(intentcb1);
            }
        });
        combo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcb1 = new Intent(combo_nhom.this, cb_uudai.class);
                startActivity(intentcb1);
            }
        });
        dath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(combo_nhom.this, donhang.class);
                startActivity(intent);
            }
        });

        dath1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(combo_nhom.this, donhang.class);
                startActivity(intent);
            }
        });
    }
}