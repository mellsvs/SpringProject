package com.eticaret.eticaret.Eslesme;

import com.eticaret.eticaret.DTO.UrunDTO;
import com.eticaret.eticaret.DTO.UserDTO;
import com.eticaret.eticaret.Veri.Urun;
import com.eticaret.eticaret.Veri.User;

public class Eslesme {
    public static UrunDTO urunDTOEsle(Urun urun){
        UrunDTO urunDTO = new UrunDTO(
                urun.getNum(),
                urun.getUrunAdi(),
                urun.getUrunAciklamasi(),
                urun.getAdet(),
                urun.getFiyat(),
                urun.getAd()

        );
        return urunDTO;
    }
    public static Urun urunEsle(UrunDTO urunDTO){
        Urun urun1= new Urun(
                urunDTO.getNum(),
               urunDTO.getUrunAdi(),
                urunDTO.getUrunAciklamasi(),
                urunDTO.getAdet(),
                urunDTO.getFiyat(),
                urunDTO.getAd()


        );
        return urun1;
    }
    public static UserDTO userDTOEsle(User user){
        UserDTO userDTO = new UserDTO(
                user.getNum(),
              user.getAd(),
                user.getSoyad(),
                user.getYas()

        );
        return userDTO;
    }
    public static User userEsle(UserDTO userDTO){
        User user1= new User(
                userDTO.getNum(),
               userDTO.getAd(),
                userDTO.getSoyad(),
                userDTO.getYas()


        );
        return user1;
    }


}
