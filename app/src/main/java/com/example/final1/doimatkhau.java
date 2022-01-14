package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

public class doimatkhau extends AppCompatActivity {
    Button btnhuydoimatkhau,btndoimatkhau;
    EditText matkhaucu,matkhatmoi,xacnhanmk;
    AwesomeValidation awesomeValidation;
    Database database;
    String Ematkhaucu,Ematkhaumoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_doimatkhau);

        database = new Database(this, "user.sqlite", null, 1);
        Cursor datauser = database.GetData("select * from thongtinuser2 where taikhoanuser = '"+dangnhap.tk+"'");

        database.QuerData("CREATE TABLE IF NOT EXISTS thongtinuser2(Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, taikhoanuser VARCHAR(200),matkhau VARCHAR(200)" +
                ",hoten VARCHAR(200),ngaythangnamsinh VARCHAR(200),email VARCHAR(200),gioitinh VARCHAR(200),sodienthoai VARCHAR(200),tinhthanh VARCHAR(200)" +
                ",quanhuyen VARCHAR(200),phuongxa VARCHAR(200),sonhatenduong VARCHAR(200) )");

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        awesomeValidation.addValidation(this, R.id.dmk_mkmoi, R.id.dmk_mk, R.string.invalid_conf_pass);

        matkhatmoi = (EditText) findViewById(R.id.dmk_mkmoi);
        matkhaucu = (EditText) findViewById(R.id.dn_mk);
        xacnhanmk = (EditText)findViewById(R.id.dmk_xacnhan);
        btndoimatkhau = (Button) findViewById(R.id.dmk_doimakhau);
        btnhuydoimatkhau = (Button) findViewById(R.id.huydoimatkhau);


        while (datauser.moveToNext()) {
            Ematkhaucu = datauser.getString(2);
        }


        btndoimatkhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String matkhau = xacnhanmk.getText().toString();
                database.QuerData("UPDATE thongtinuser2 SET matkhau ='"+matkhau+"'where taikhoanuser = '"+dangnhap.tk+"'");
                Toast.makeText(doimatkhau.this, "Chỉnh sửa thành công", Toast.LENGTH_SHORT).show();

            }
        });

        btnhuydoimatkhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}