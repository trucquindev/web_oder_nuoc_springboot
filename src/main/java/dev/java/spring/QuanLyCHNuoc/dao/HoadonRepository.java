package dev.java.spring.QuanLyCHNuoc.dao;

import dev.java.spring.QuanLyCHNuoc.entity.Hoadon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
@RepositoryRestResource(path = "hoadons")
public interface HoadonRepository extends JpaRepository<Hoadon,String > {
    @Query("select h from Hoadon h")
    public List<Hoadon> findAll();
}