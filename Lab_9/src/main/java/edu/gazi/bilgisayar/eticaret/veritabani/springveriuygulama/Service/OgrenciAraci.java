package edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Service;

import edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Entity.Ogrenci;

import java.util.List;

public interface OgrenciAraci {
    Ogrenci yeniOgrenci(Ogrenci ogrenci);
    Ogrenci getOgrenci(Long ogrenciId);
    void deleteOgrenci(Long ogrenciId);
    Ogrenci updateOgrenci(Ogrenci ogrenci);
    List<Ogrenci> getAllOgrenci();
}
