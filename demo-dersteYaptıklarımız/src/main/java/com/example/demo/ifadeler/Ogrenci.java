package com.example.demo.ifadeler;

public class Ogrenci {
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

    private String ad;
    private String soyad;
    private int yas;
    private int ozellik1;
    private int ozellik2;
    private int ozellik3;

    public Ogrenci(String ad, String soyad, int yas, int ozellik1, int ozellik2, int ozellik3) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.ozellik1 = ozellik1;
        this.ozellik2 = ozellik2;
        this.ozellik3 = ozellik3;
    }

    public int getOzellik1() {
        return ozellik1;
    }

    public void setOzellik1(int ozellik1) {
        this.ozellik1 = ozellik1;
    }

    public int getOzellik2() {
        return ozellik2;
    }

    public void setOzellik2(int ozellik2) {
        this.ozellik2 = ozellik2;
    }

    public int getOzellik3() {
        return ozellik3;
    }

    public void setOzellik3(int ozellik3) {
        this.ozellik3 = ozellik3;
    }
}
