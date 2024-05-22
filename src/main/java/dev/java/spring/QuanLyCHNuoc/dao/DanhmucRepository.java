package dev.java.spring.QuanLyCHNuoc.dao;

import dev.java.spring.QuanLyCHNuoc.entity.Ban;
import dev.java.spring.QuanLyCHNuoc.entity.Danhmuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RepositoryRestResource(path = "danhmucs")
public interface DanhmucRepository extends JpaRepository<Danhmuc,String> {
}
