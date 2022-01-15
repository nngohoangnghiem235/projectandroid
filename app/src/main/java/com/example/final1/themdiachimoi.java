package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class themdiachimoi extends AppCompatActivity {
    Button btnhuythemdiachi,themdiachi;
    EditText ten,sdt,phuongxa,quanhuyen,sonha,tinhthanh;
    Database database;
    String Sten,Ssdt,Sphuongxa,Squanhuyen,Ssonha,Stinhthanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_themdiachimoi);

        database = new Database(this, "user.sqlite", null, 1);
        database.QuerData("CREATE TABLE IF NOT EXISTS thongtinuser2(Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, taikhoanuser VARCHAR(200),matkhau VARCHAR(200)" +
                ",hoten VARCHAR(200),ngaythangnamsinh VARCHAR(200),email VARCHAR(200),gioitinh VARCHAR(200),sodienthoai VARCHAR(200),tinhthanh VARCHAR(200)" +
                ",quanhuyen VARCHAR(200),phuongxa VARCHAR(200),sonhatenduong VARCHAR(200) )");

        themdiachi = (Button)findViewById(R.id.tdc_themdiachi);
        ten = (EditText)findViewById(R.id.tdc_hovaten);
        sdt = (EditText)findViewById(R.id.tdc_sdt);
        phuongxa = (EditText)findViewById(R.id.tdc_phuongxa);
        quanhuyen = (EditText)findViewById(R.id.tdc_quanhuyen);
        tinhthanh = (EditText)findViewById(R.id.tdc_tinhthanh);
        sonha =(EditText)findViewById(R.id.tdc_sonha);
        Cursor datauser = database.GetData("select * from thongtinuser2 where taikhoanuser = '"+dangnhap.tk+"'");
        while (datauser.moveToNext()) {
            Sten = datauser.getString(3);
            Ssdt = datauser.getString(7);
            Stinhthanh = datauser.getString(8);
            Squanhuyen = datauser.getString(9);
            Sphuongxa = datauser.getString(10);
            Ssonha = datauser.getString(11);
        }
        ten.setText(Sten);
        sdt.setText(Ssdt);
        tinhthanh.setText(Stinhthanh);
        phuongxa.setText(Sphuongxa);
        quanhuyen.setText(Squanhuyen);
        sonha.setText(Ssonha);


        btnhuythemdiachi = (Button) findViewById(R.id.huythemdiachi);
        btnhuythemdiachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();}
        });

        themdiachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Cten = ten.getText().toString();
                String Csdt = sdt.getText().toString();
                String Ctinhthanh = tinhthanh.getText().toString();
                String Cquanhuyen = quanhuyen.getText().toString();
                String Cphuongxa = phuongxa.getText().toString();
                String Csonha = sonha.getText().toString();
                database.QuerData("UPDATE thongtinuser2 SET hoten ='"+Cten+"',sodienthoai = '"+Csdt+"',tinhthanh = '"+Ctinhthanh+"',quanhuyen='"+Cquanhuyen+"'," +
                        "phuongxa = '"+Cphuongxa+"',sonhatenduong = '"+Csonha+"' where taikhoanuser = '"+dangnhap.tk+"'");
                Toast.makeText(themdiachimoi.this, "Chỉnh sửa thành công", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}