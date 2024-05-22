package dev.java.spring.QuanLyCHNuoc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ban")
public class Ban {
    @Id
    @Column(name = "maban_id",length = 10)
    private String maban_id;
    @Column(name = "tenban",length = 200)
    private String tenban;
    @Column(name = "trangthai",length = 20)
    private String trangthai;
    @Column(name = "mota",length = 200)
    private String mota;
    @Column(name = "makhuvuc_id",length = 10)
    private String makhuvuc_id;

    public Ban() {
    }

    public Ban(String maban_id, String tenban, String trangthai, String mota, String makhuvuc_id) {
        this.maban_id = maban_id;
        this.tenban = tenban;
        this.trangthai = trangthai;
        this.mota = mota;
        this.makhuvuc_id = makhuvuc_id;
    }

    public String getMaban_id() {
        return maban_id;
    }

    public void setMaban_id(String maban_id) {
        this.maban_id = maban_id;
    }

    public String getTenban() {
        return tenban;
    }

    public void setTenban(String tenban) {
        this.tenban = tenban;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getMakhuvuc_id() {
        return makhuvuc_id;
    }

    public void setMakhuvuc_id(String makhuvuc_id) {
        this.makhuvuc_id = makhuvuc_id;
    }
}
