package edu.obs.obs.Repository;

import edu.obs.obs.Veri.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepo extends JpaRepository<Ogrenci,Long> {
}
