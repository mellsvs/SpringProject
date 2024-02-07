package edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Repository;

import edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Entity.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgrenciRepo extends JpaRepository<Ogrenci, Long> {
}
