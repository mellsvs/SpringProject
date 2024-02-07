package com.eticaret.eticaret.DTO;

import jakarta.validation.constraints.NotEmpty;

public class UrunDTO {
    private long num;
    @NotEmpty(message = "Urunun Adını yazınız")
    private String urunAdi;
    @NotEmpty(message = "urunun acıklamasını yazınız.")
    private String urunAciklamasi;
    private int adet;
    private int fiyat;
    private String ad;
    public UrunDTO(){

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
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

    public UrunDTO(long num, String urunAdi, String urunAciklamasi, int adet, int fiyat, String ad) {
        this.num = num;
        this.urunAdi = urunAdi;
        this.urunAciklamasi = urunAciklamasi;
        this.adet = adet;
        this.fiyat = fiyat;
        this.ad = ad;
    }
}
