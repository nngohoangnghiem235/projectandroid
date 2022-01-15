package com.example.final1;

public class listpizza {
    private String ten;
    private String mon1;
    private String mon2;
    private int hinh;

    public listpizza(String ten, String mon1, String mon2, int hinh) {
        this.ten = ten;
        this.mon1 = mon1;
        this.mon2 = mon2;

        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMon1() {
        return mon1;
    }

    public void setMon1(String mon1) {
        this.mon1 = mon1;
    }

    public String getMon2() {
        return mon2;
    }

    public void setMon2(String mon2) {
        this.mon2 = mon2;
    }


    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
