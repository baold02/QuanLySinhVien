package com.example.quanlysinhvien.Model;

public class StudentXends{
  private int stt;
  private String malop;
  private String tenlop;

    public StudentXends(int stt, String malop, String tenlop) {
        this.stt = stt;
        this.malop = malop;
        this.tenlop = tenlop;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }
}
