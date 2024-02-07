package com.eticaret.eticaret.Veri;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Urun {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num;
    private String urunAdi;
    private String urunAciklamasi;
    private int adet;
    private int fiyat;
    private String ad;
    public Urun(){

    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunAciklamasi() {
        return urunAciklamasi;
    }

    public void setUrunAciklamasi(String urunAciklamasi) {
        this.urunAciklamasi = urunAciklamasi;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Urun(long num, String urunAdi, String urunAciklamasi, int adet, int fiyat, String ad) {
        this.num = num;
        this.urunAdi = urunAdi;
        this.urunAciklamasi = urunAciklamasi;
        this.adet = adet;
        this.fiyat = fiyat;
        this.ad = ad;
    }
}
