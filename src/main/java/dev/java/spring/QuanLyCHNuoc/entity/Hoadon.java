package dev.java.spring.QuanLyCHNuoc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "hoadon")
public class Hoadon {
    @Id
    @Column(name = "mahoadon_id",length = 10)
    private String mahoadon_id;
    @Column(name = "maban_id",length = 10)
    private String maban_id;
    @Column(name = "tongtien")
    private double tongtien;
    @Column(name = "ngayban")
    private Date ngayban;

    public Hoadon() {
    }

    public Hoadon(String mahoadon_id, String maban_id, double tongtien, Date ngayban) {
        this.mahoadon_id = mahoadon_id;
        this.maban_id = maban_id;
        this.tongtien = tongtien;
        this.ngayban = ngayban;
    }

    public String getMahoadon_id() {
        return mahoadon_id;
    }

    public void setMahoadon_id(String mahoadon_id) {
        this.mahoadon_id = mahoadon_id;
    }

    public String getMaban_id() {
        return maban_id;
    }

    public void setMaban_id(String maban_id) {
        this.maban_id = maban_id;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public Date getNgayban() {
        return ngayban;
    }

    public void setNgayban(Date ngayban) {
        this.ngayban = ngayban;
    }
}
