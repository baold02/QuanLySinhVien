package com.example.quanlysinhvien.Model;

public class Studentquanly {
  private String mssv;
  private String Ten;
  private String ngay;
  private int id_class;
  private String sdt;
  private String email;

    public Studentquanly() {
    }

    public Studentquanly(String mssv, String ten, String ngay, int id_class, String sdt, String email) {
        this.mssv = mssv;
        Ten = ten;
        this.ngay = ngay;
        this.id_class = id_class;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public int getId_class() {
        return id_class;
    }

    public void setId_class(int id_class) {
        this.id_class = id_class;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
