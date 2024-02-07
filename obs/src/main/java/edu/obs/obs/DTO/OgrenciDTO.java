package edu.obs.obs.DTO;

import jakarta.validation.constraints.NotEmpty;
import org.apache.logging.log4j.message.Message;

public class OgrenciDTO {
    private long num;
    @NotEmpty(message =" Ogrenci adını yazınız")
    private  String ad;
    @NotEmpty(message =" Ogrenci soyadını yazınız")
    private String soyad;
    private int yas;
    public OgrenciDTO(){

    }

    public OgrenciDTO(long num, String ad, String soyad, int yas) {
        this.num = num;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
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
}
