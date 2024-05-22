package dev.java.spring.QuanLyCHNuoc.service;

import dev.java.spring.QuanLyCHNuoc.entity.Hoadon;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface HoadonService {
    public void SaveOder(String mahd, String maban, double tongtien);
    public List<Hoadon> findAll();
}
