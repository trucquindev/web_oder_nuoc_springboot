package dev.java.spring.QuanLyCHNuoc.entity;

public class Hoadondto {
    private String ma_hoadon;
    private String maban_id;
    private int tongtien;

    public Hoadondto() {
    }

    public Hoadondto(String ma_hoadon, String maban_id, int tongtien) {
        this.ma_hoadon = ma_hoadon;
        this.maban_id = maban_id;
        this.tongtien = tongtien;
    }

    public String getMa_hoadon() {
        return ma_hoadon;
    }

    public void setMa_hoadon(String ma_hoadon) {
        this.ma_hoadon = ma_hoadon;
    }

    public String getMaban_id() {
        return maban_id;
    }

    public void setMaban_id(String maban_id) {
        this.maban_id = maban_id;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }
}
