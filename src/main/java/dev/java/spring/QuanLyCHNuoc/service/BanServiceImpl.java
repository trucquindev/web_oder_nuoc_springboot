package dev.java.spring.QuanLyCHNuoc.service;

import dev.java.spring.QuanLyCHNuoc.dao.BanRepository;
import dev.java.spring.QuanLyCHNuoc.entity.Ban;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanServiceImpl implements BanService{
    private BanRepository banRepository;
    @Autowired
    public BanServiceImpl(BanRepository banRepository) {
        this.banRepository = banRepository;
    }

    @Override
    public List<Ban> getAllBan() {
        return this.banRepository.getAllBan();
    }
}
