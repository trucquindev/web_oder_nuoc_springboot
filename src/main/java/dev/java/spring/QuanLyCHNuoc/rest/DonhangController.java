package dev.java.spring.QuanLyCHNuoc.rest;

import dev.java.spring.QuanLyCHNuoc.entity.Hoadon;
import dev.java.spring.QuanLyCHNuoc.service.HoadonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/donhang")
public class DonhangController {
    private HoadonService hoadonService;
    @Autowired
    public DonhangController(HoadonService hoadonService) {
        this.hoadonService = hoadonService;
    }

    @GetMapping()
    public String showDonHang(Model model){
        List<Hoadon> hoadons= this.hoadonService.findAll();
        model.addAttribute("hoadons",hoadons);
        return "donhang";
    }
}
