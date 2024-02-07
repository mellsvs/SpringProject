package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.DTO.UrunDTO;
import com.eticaret.eticaret.DTO.UserDTO;
import com.eticaret.eticaret.Eslesme.Eslesme;
import com.eticaret.eticaret.Repository.UrunRepo;
import com.eticaret.eticaret.Repository.UserRepo;
import com.eticaret.eticaret.Veri.Urun;
import com.eticaret.eticaret.Veri.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServisUyg implements UserServisi{
 private UserRepo userRepo;

    public UserServisUyg(UserRepo userRepo) {
        this.userRepo = userRepo;
    }



    @Override
    public List<UserDTO> getButunKullanicilar() {
        List<User> userListesi=userRepo.findAll();
        List<UserDTO>userDTOListesi=userListesi.stream().map((user) -> Eslesme.userDTOEsle(user)).collect(Collectors.toList());
        return userDTOListesi;
    }
}
