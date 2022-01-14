package com.example.final1;

import java.util.Date;
import java.util.Queue;

public class taikhoanuser {
    String taikhoan,matkhau,hovaten,email,gioitinh,sodienthoai,tinhthanh,quanhuyen,phuongxa,sonhatenduong;
    Date ngaysinh;
    public  taikhoanuser(){}
    public taikhoanuser(String taikhoan, String matkhau, String hovaten, String email, String gioitinh, String sodienthoai, String tinhthanh, String quanhuyen, String phuongxa, String sonhatenduong, Date ngaysinh) {
        this.taikhoan = taikhoan;
        this.matkhau = matkhau;
        this.hovaten = hovaten;
        this.email = email;
        this.gioitinh = gioitinh;
        this.sodienthoai = sodienthoai;
        this.tinhthanh = tinhthanh;
        this.quanhuyen = quanhuyen;
        this.phuongxa = phuongxa;
        this.sonhatenduong = sonhatenduong;
        this.ngaysinh = ngaysinh;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getTinhthanh() {
        return tinhthanh;
    }

    public void setTinhthanh(String tinhthanh) {
        this.tinhthanh = tinhthanh;
    }

    public String getQuanhuyen() {
        return quanhuyen;
    }

    public void setQuanhuyen(String quanhuyen) {
        this.quanhuyen = quanhuyen;
    }

    public String getPhuongxa() {
        return phuongxa;
    }

    public void setPhuongxa(String phuongxa) {
        this.phuongxa = phuongxa;
    }

    public String getSonhatenduong() {
        return sonhatenduong;
    }

    public void setSonhatenduong(String sonhatenduong) {
        this.sonhatenduong = sonhatenduong;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }}

