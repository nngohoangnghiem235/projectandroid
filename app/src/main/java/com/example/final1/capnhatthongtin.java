package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class capnhatthongtin extends AppCompatActivity {
    Button btnhuycapnhatthongtin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_capnhatthongtin);
        btnhuycapnhatthongtin = (Button) findViewById(R.id.huycapnhatthongtin);
        btnhuycapnhatthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}