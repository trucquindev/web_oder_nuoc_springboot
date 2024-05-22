package dev.java.spring.QuanLyCHNuoc.dao;

import dev.java.spring.QuanLyCHNuoc.entity.Ban;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RepositoryRestResource(path = "bans")
public interface BanRepository extends JpaRepository<Ban,String > {
    @Query("SELECT b FROM Ban b")
    public List<Ban> getAllBan();
}
