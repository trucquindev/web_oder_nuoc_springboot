package dev.java.spring.QuanLyCHNuoc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "chitietdonhang")
public class Chitietdonhang {
    @Id
    @Column(name = "machitiet_id",length = 10)
    private String machitiet_id;
    @Column(name = "mahoadon_id",length = 10)
    private String mahoadon_id;
    @Column(name = "madouong_id",length = 10)
    private String madouong_id;
    @Column(name = "dongia")
    private double dongia;
    @Column(name = "soluong")
    private int soluong;

    public Chitietdonhang() {
    }

    public Chitietdonhang(String machitiet_id, String mahoadon_id, String madouong_id, double dongia, int soluong) {
        this.machitiet_id = machitiet_id;
        this.mahoadon_id = mahoadon_id;
        this.madouong_id = madouong_id;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public String getMachitiet_id() {
        return machitiet_id;
    }

    public void setMachitiet_id(String machitiet_id) {
        this.machitiet_id = machitiet_id;
    }

    public String getMahoadon_id() {
        return mahoadon_id;
    }

    public void setMahoadon_id(String mahoadon_id) {
        this.mahoadon_id = mahoadon_id;
    }

    public String getMadouong_id() {
        return madouong_id;
    }

    public void setMadouong_id(String madouong_id) {
        this.madouong_id = madouong_id;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
