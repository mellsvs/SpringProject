package edu.obs.obs.Eslesme;

import edu.obs.obs.DTO.OgrenciDTO;
import edu.obs.obs.Veri.Ogrenci;

public class Eslesme {

    public static OgrenciDTO ogrenciDTOEsle(Ogrenci ogrenci){
        OgrenciDTO ogrenciDTO = new OgrenciDTO(
        ogrenci.getNum(),
        ogrenci.getAd(),
        ogrenci.getSoyad(),
        ogrenci.getYas()
        );
        return ogrenciDTO;
    }
    public static Ogrenci ogrenciEsle(OgrenciDTO ogrenciDTO){
        Ogrenci ogr1= new Ogrenci(
                ogrenciDTO.getNum(),
                ogrenciDTO.getAd(),
                ogrenciDTO.getSoyad(),
                ogrenciDTO.getYas()
        );
        return ogr1;
    }



}
