package dev.java.spring.QuanLyCHNuoc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "danhmuc")
public class Danhmuc {
    @Id
    @Column(name = "madanhmuc_id",length = 10)
    private String madanhmuc_id;
    @Column(name = "tendanhmuc",length = 100)
    private String tendanhmuc;

    public Danhmuc() {
    }

    public Danhmuc(String madanhmuc_id, String tendanhmuc) {
        this.madanhmuc_id = madanhmuc_id;
        this.tendanhmuc = tendanhmuc;
    }

    public String getMadanhmuc_id() {
        return madanhmuc_id;
    }

    public void setMadanhmuc_id(String madanhmuc_id) {
        this.madanhmuc_id = madanhmuc_id;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }
}
