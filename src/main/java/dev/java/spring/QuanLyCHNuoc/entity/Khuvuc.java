package dev.java.spring.QuanLyCHNuoc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "khuvuc")
public class Khuvuc {
    @Id
    @Column(name = "makhuvuc_id",length = 10)
    private String makhuvuc_id;
    @Column(name = "tenkhucvuc")
    private String tenkhuvuc;
    @Column(name = "mota")
    private String mota;

    public Khuvuc() {
    }

    public Khuvuc(String makhuvuc_id, String tenkhuvuc, String mota) {
        this.makhuvuc_id = makhuvuc_id;
        this.tenkhuvuc = tenkhuvuc;
        this.mota = mota;
    }

    public String getMakhuvuc_id() {
        return makhuvuc_id;
    }

    public void setMakhuvuc_id(String makhuvuc_id) {
        this.makhuvuc_id = makhuvuc_id;
    }

    public String getTenkhuvuc() {
        return tenkhuvuc;
    }

    public void setTenkhuvuc(String tenkhuvuc) {
        this.tenkhuvuc = tenkhuvuc;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
