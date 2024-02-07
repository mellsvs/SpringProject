package edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Ad;
    private String Soyad;
    private int Yas;

    public Ogrenci() {
    }

    public Ogrenci(Long id, String ad, String soyad, int yas) {
        Id = id;
        Ad = ad;
        Soyad = soyad;
        Yas = yas;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public int getYas() {
        return Yas;
    }

    public void setYas(int yas) {
        Yas = yas;
    }
}
