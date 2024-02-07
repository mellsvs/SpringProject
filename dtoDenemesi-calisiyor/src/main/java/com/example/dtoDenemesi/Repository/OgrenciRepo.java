package com.example.dtoDenemesi.Repository;

import com.example.dtoDenemesi.Entity.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepo extends JpaRepository<Ogrenci,Long> {
}
