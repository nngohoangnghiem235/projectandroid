package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class capnhatthongtin extends AppCompatActivity {
    Button btnhuycapnhatthongtin, btncapnhatthongtin;
    TextView nameuser;
    EditText edthovaten, edtemail, edtngaysinh, GioiTinh;
    Database database;
    String ten, ngaysinh, Email, gioitinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_capnhatthongtin);

        database = new Database(this, "user.sqlite", null, 1);
        // tao bang
        database.QuerData("CREATE TABLE IF NOT EXISTS thongtinuser2(Id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, taikhoanuser VARCHAR(200),matkhau VARCHAR(200)" +
                ",hoten VARCHAR(200),ngaythangnamsinh VARCHAR(200),email VARCHAR(200),gioitinh VARCHAR(200),sodienthoai VARCHAR(200),tinhthanh VARCHAR(200)" +
                ",quanhuyen VARCHAR(200),phuongxa VARCHAR(200),sonhatenduong VARCHAR(200) )");


        btncapnhatthongtin = (Button) findViewById(R.id.xacnhancapnhat);
        btnhuycapnhatthongtin = (Button) findViewById(R.id.huycapnhatthongtin);
        nameuser = (TextView) findViewById(R.id.tenuser);
        edthovaten = (EditText) findViewById(R.id.nameuser);
        edtemail = (EditText) findViewById(R.id.email);
        edtngaysinh = (EditText) findViewById(R.id.dob);
        GioiTinh = (EditText) findViewById(R.id.gioitinh);
        Cursor datauser = database.GetData("select * from thongtinuser2 where taikhoanuser = '"+dangnhap.tk+"'");
        while (datauser.moveToNext()) {
            ten = datauser.getString(3);
            ngaysinh = datauser.getString(4);
            Email = datauser.getString(5);
            gioitinh = datauser.getString(6);
        }

        edthovaten.setText(ten);
        edtngaysinh.setText(ngaysinh);
        edtemail.setText(Email);
        GioiTinh.setText(gioitinh);


        btnhuycapnhatthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btncapnhatthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String hoten = edthovaten.getText().toString();
                String email = edtemail.getText().toString();
                String tuoi = edtngaysinh.getText().toString();
                String gioitinh = GioiTinh.getText().toString();

//            database.QuerData("INSERT into thongtinuser2 (hoten,ngaythangnamsinh,email,gioitinh) VALUES('"+hoten+"','"+email+"','"+tuoi+"','"+gioitinh+"')");
           database.QuerData("UPDATE thongtinuser2 SET hoten ='"+hoten+"',ngaythangnamsinh = '"+tuoi+"',email = '"+email+"',gioitinh='"+gioitinh+"' where taikhoanuser = '"+dangnhap.tk+"'");
                Toast.makeText(capnhatthongtin.this, "Chỉnh sửa thành công", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

    }


}
