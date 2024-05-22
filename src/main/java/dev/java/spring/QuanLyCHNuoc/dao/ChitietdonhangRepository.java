package dev.java.spring.QuanLyCHNuoc.dao;

import dev.java.spring.QuanLyCHNuoc.entity.Chitietdonhang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "chitietdonhangs")
public interface ChitietdonhangRepository extends JpaRepository<Chitietdonhang,String > {

}
