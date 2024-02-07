package com.gazi.nuri.veritabani.hafta9veritabani.DTO;

import com.gazi.nuri.veritabani.hafta9veritabani.Veri.Ogrenci;

public class OgrenciEsleme {

    public static OgrenciDTO ogrenciDTOesle(Ogrenci ogrenci) {

        OgrenciDTO ogrenciDTO = new OgrenciDTO(
                ogrenci.getId(),
                ogrenci.getAd(),
                ogrenci.getSoyad()

        );
        return ogrenciDTO;
    }
        public static Ogrenci ogrenciEsle(OgrenciDTO ogrenciDTO){

        Ogrenci ogr1=new Ogrenci(
                ogrenciDTO.getId(),
                ogrenciDTO.getAd(),
                ogrenciDTO.getSoyad()

        );
        return ogr1;

        }

}
