 package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ThirdActivity extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_third);
        Spinner spinner =(Spinner) findViewById(R.id.spinner);
        TextView tv = (TextView) findViewById(R.id.text);
        Button btnB = (Button) findViewById(R.id.btnBack);
        Button btnQV = (Button) findViewById(R.id.btnQV);
        Button btnTiep = (Button) findViewById(R.id.btnTiep);

        ArrayList<String> arrayThanhToan = new ArrayList<String>();
        arrayThanhToan.add("Thanh toán khi nhận hàng");
        arrayThanhToan.add("Thanh toán trực tuyến");
        arrayThanhToan.add("Thanh toán qua ví điện tử");

        btnTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, finaldonhang.class);
                startActivity(intent);
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, second.class);
                startActivity(intent);
            }
        });
        btnQV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, second.class);
                startActivity(intent);
            }
        });

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_spinner_item,R.id.text,arrayThanhToan);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}