package com.eticaret.eticaret.DTO;

import jakarta.validation.constraints.NotEmpty;

public class UserDTO {
    private int num;
    @NotEmpty(message =" kullanıcı adını yazınız")
    private String ad;
    @NotEmpty(message =" kullanıcı soyadını yazınız")
    private String soyad;
    private int yas;
    public UserDTO(){

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
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

    public UserDTO(int num, String ad, String soyad, int yas) {
        this.num = num;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }
}
