package dev.java.spring.QuanLyCHNuoc.rest;

import dev.java.spring.QuanLyCHNuoc.dao.MenudouongRepository;
import dev.java.spring.QuanLyCHNuoc.entity.Ban;
import dev.java.spring.QuanLyCHNuoc.entity.Menudouong;
import dev.java.spring.QuanLyCHNuoc.service.BanService;
import dev.java.spring.QuanLyCHNuoc.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping()
public class OderController {
    private MenuService menuService;
    private BanService banService;
    @Autowired
    public OderController(MenuService menuService, BanService banService) {
        this.menuService = menuService;
        this.banService = banService;
    }



    @GetMapping()
    public String home(Model model){
        List<Menudouong> menus= this.menuService.getAllMenu();
        List<Ban> bans=this.banService.getAllBan();
        model.addAttribute("menus",menus);
        model.addAttribute("bans",bans);
        return "thungan";
    }
}
