package dev.java.spring.QuanLyCHNuoc.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "menudouong")
public class Menudouong {
    @Id
    @Column(name = "madouong_id",length = 10)
    private String madouong_id;
    @Column(name = "tendouong",length = 100)
    private String tendouong;
    @ManyToOne
    @JoinColumn(name = "dongia_id")
    private Dongia dongia;
//    @Column(name = "dongia_id",length = 10)
//    private String dongia_id;
    @Column(name = "madanhmuc_id",length = 10)
    private String madanhmuc_id;

    public Menudouong() {
    }

    public Menudouong(String madouong_id, String tendouong, Dongia dongia, String madanhmuc_id) {
        this.madouong_id = madouong_id;
        this.tendouong = tendouong;
        this.dongia = dongia;
        this.madanhmuc_id = madanhmuc_id;
    }

    public String getMadouong_id() {
        return madouong_id;
    }

    public void setMadouong_id(String madouong_id) {
        this.madouong_id = madouong_id;
    }

    public String getTendouong() {
        return tendouong;
    }

    public void setTendouong(String tendouong) {
        this.tendouong = tendouong;
    }

    public Dongia getDongia() {
        return dongia;
    }

    public void setDongia(Dongia dongia) {
        this.dongia = dongia;
    }

    public String getMadanhmuc_id() {
        return madanhmuc_id;
    }

    public void setMadanhmuc_id(String madanhmuc_id) {
        this.madanhmuc_id = madanhmuc_id;
    }
}
