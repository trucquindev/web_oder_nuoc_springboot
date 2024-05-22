package dev.java.spring.QuanLyCHNuoc.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "dongia")
public class Dongia {
    @Id
    @Column(name = "dongia_id",length = 10)
    private String dongia_id;
    @Column(name = "madouong_id",length = 10)
    private String madouong_id;
    @Column(name = "tungay")
    private Date tungay;
    @Column(name = "denngay")
    private Date denngay;
    @Column(name = "mota",length = 200)
    private String mota;
    @Column(name = "gia")
    private double gia;

    public Dongia() {
    }

    public Dongia(String dongia_id, String madouong_id, Date tungay, Date denngay, String mota, double gia) {
        this.dongia_id = dongia_id;
        this.madouong_id = madouong_id;
        this.tungay = tungay;
        this.denngay = denngay;
        this.mota = mota;
        this.gia = gia;
    }

    public String getDongia_id() {
        return dongia_id;
    }

    public void setDongia_id(String dongia_id) {
        this.dongia_id = dongia_id;
    }

    public String getMadouong_id() {
        return madouong_id;
    }

    public void setMadouong_id(String madouong_id) {
        this.madouong_id = madouong_id;
    }

    public Date getTungay() {
        return tungay;
    }

    public void setTungay(Date tungay) {
        this.tungay = tungay;
    }

    public Date getDenngay() {
        return denngay;
    }

    public void setDenngay(Date denngay) {
        this.denngay = denngay;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
