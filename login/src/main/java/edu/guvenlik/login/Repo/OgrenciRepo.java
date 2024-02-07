package edu.guvenlik.login.Repo;

import edu.guvenlik.login.Veri.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepo extends JpaRepository<Ogrenci,Long> {
    Ogrenci findByAd(String ad);
}
