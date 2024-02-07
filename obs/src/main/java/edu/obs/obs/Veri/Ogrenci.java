package edu.obs.obs.Veri;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ogrenci {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long num;
    private  String ad;
    private String soyad;
    private int yas;
    public Ogrenci(){

    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Ogrenci(long num, String ad, String soyad, int yas) {
        this.num = num;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }
}
