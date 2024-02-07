package com.example.dtoDenemesi.Service;

import com.example.dtoDenemesi.DTO.OgrenciDTO;
import com.example.dtoDenemesi.Entity.Ogrenci;

import java.util.List;

public interface OgrenciAraci {
    OgrenciDTO yeniOgrenci(OgrenciDTO ogrenci);
    OgrenciDTO getirOgrenci(Long ogrenciId);

    List<OgrenciDTO> getirOgrenciler();

    OgrenciDTO guncelleOgrenci(OgrenciDTO ogrenci);
    void silOgrenci(Long ogrenciId);

}
