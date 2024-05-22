package dev.java.spring.QuanLyCHNuoc.service;

import dev.java.spring.QuanLyCHNuoc.dao.MenudouongRepository;
import dev.java.spring.QuanLyCHNuoc.entity.Menudouong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{
    private MenudouongRepository menudouongRepository;
    @Autowired
    public MenuServiceImpl(MenudouongRepository menudouongRepository) {
        this.menudouongRepository = menudouongRepository;
    }

    @Override
    public List<Menudouong> getAllMenu() {
        return this.menudouongRepository.getAllMenu();
    }
}
