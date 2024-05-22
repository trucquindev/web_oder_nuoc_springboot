package dev.java.spring.QuanLyCHNuoc.service;

import dev.java.spring.QuanLyCHNuoc.dao.HoadonRepository;
import dev.java.spring.QuanLyCHNuoc.entity.Hoadon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class OderServiceImple implements HoadonService{
    private HoadonRepository hoadonRepository;
    @Autowired
    public OderServiceImple(HoadonRepository hoadonRepository) {
        this.hoadonRepository = hoadonRepository;
    }
    @Transactional
    @Override
    public void SaveOder(String mahd, String maban, double tongtien) {
        Hoadon hd= new Hoadon();
        hd.setMahoadon_id(mahd);
        hd.setMaban_id(maban);
        hd.setTongtien(tongtien);
        hoadonRepository.save(hd);
    }

    @Override
    public List<Hoadon> findAll() {
        return this.hoadonRepository.findAll();
    }
}
