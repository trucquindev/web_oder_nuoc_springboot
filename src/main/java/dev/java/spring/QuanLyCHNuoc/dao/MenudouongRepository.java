package dev.java.spring.QuanLyCHNuoc.dao;

import dev.java.spring.QuanLyCHNuoc.entity.Menudouong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RepositoryRestResource(path = "menudouongs")
public interface MenudouongRepository extends JpaRepository<Menudouong,String > {
    @Query("select m from Menudouong m ")
    public List<Menudouong> getAllMenu();
}
