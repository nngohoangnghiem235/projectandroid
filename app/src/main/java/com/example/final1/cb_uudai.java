package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cb_uudai extends AppCompatActivity {
    Button combo1, combo2,dath,dath1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb_uudai);
        combo1 = (Button)findViewById(R.id.cb1);
        combo2 = (Button)findViewById(R.id.cb2);
        dath = (Button) findViewById(R.id.dathang);
        dath1 =(Button) findViewById(R.id.dathang1);
        combo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcb1 = new Intent(cb_uudai.this, trangchu.class);
                startActivity(intentcb1);
            }
        });
        combo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcb1 = new Intent(cb_uudai.this, combo_nhom.class);
                startActivity(intentcb1);
            }
        });

        dath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cb_uudai.this, donhang.class);
                startActivity(intent);
            }
        });

        dath1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cb_uudai.this, donhang.class);
                startActivity(intent);
            }
        });
    }
}