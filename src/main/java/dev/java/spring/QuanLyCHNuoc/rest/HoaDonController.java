package dev.java.spring.QuanLyCHNuoc.rest;

import dev.java.spring.QuanLyCHNuoc.entity.Hoadon;
import dev.java.spring.QuanLyCHNuoc.entity.Hoadondto;
import dev.java.spring.QuanLyCHNuoc.service.HoadonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HoaDonController {
    private HoadonService hoadonService;
    @Autowired
    public HoaDonController(HoadonService hoadonService) {
        this.hoadonService = hoadonService;
    }

    @PostMapping("/saverOder")
    public ResponseEntity<String> saveOrder(@RequestBody Hoadondto hoadondto) {
        hoadonService.SaveOder(hoadondto.getMa_hoadon(), hoadondto.getMaban_id(), hoadondto.getTongtien());
        return ResponseEntity.ok("Order saved successfully");
    }
}
