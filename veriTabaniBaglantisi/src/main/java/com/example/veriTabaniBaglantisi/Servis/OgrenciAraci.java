package com.example.veriTabaniBaglantisi.Servis;

import com.example.veriTabaniBaglantisi.Veri.Ogrenci;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OgrenciAraci {
    Ogrenci yeniOgrenci(Ogrenci ogrenci);
    Ogrenci getOgrenci(Long ogrenciId);
    void deleteOgrenci(Long ogrenciId);
    Ogrenci updateOgrenci(Ogrenci ogrenci);
    List<Ogrenci> getAllOgrenci();
}
