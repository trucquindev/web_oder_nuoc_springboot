package dev.java.spring.QuanLyCHNuoc.dao;

import dev.java.spring.QuanLyCHNuoc.entity.Dongia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "dongias")
public interface DongiaRepository extends JpaRepository<Dongia,String> {
}
