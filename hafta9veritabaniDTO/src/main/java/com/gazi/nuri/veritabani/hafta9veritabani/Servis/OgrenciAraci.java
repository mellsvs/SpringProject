package com.gazi.nuri.veritabani.hafta9veritabani.Servis;


import com.gazi.nuri.veritabani.hafta9veritabani.DTO.OgrenciDTO;

import java.util.List;

public interface OgrenciAraci {
    OgrenciDTO yeniOgrenci(OgrenciDTO ogrenci);
    OgrenciDTO getirOgrenci(Long ogrenciId);

    List<OgrenciDTO> getirOgrenciler();

    OgrenciDTO guncelleOgrenci(OgrenciDTO ogrenci);
    void silOgrenci(Long ogrenciId);


}
