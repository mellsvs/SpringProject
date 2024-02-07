package com.eticaret.eticaret.Repository;

import com.eticaret.eticaret.Veri.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
