package edu.guvenlik.login.Repo;

import edu.guvenlik.login.Veri.Yetki;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YetkiRepo extends JpaRepository<Yetki, Long> {

    Yetki findByYetkiAd(String ad);
}
