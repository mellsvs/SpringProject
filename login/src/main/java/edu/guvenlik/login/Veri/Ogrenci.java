package edu.guvenlik.login.Veri;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Ogrenci {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num ;
    private String ad;
    private String soyad;
    private Integer yas;
    private  String sifre;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name = "OgrenciYetkiler",
            joinColumns = {@JoinColumn(name = "ogrenciNum",referencedColumnName = "num")},
            inverseJoinColumns = {@JoinColumn(name = "yetkiNum",referencedColumnName = "num")}
    )
    private List<Yetki> yetkiler= new ArrayList<>();

    public Ogrenci() {
    }

    public Ogrenci(Long num, String ad, String soyad, Integer yas, String sifre, List<Yetki> yetkiler) {
        this.num = num;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.sifre = sifre;
        this.yetkiler = yetkiler;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
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

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public List<Yetki> getYetkiler() {
        return yetkiler;
    }

    public void setYetkiler(List<Yetki> yetkiler) {
        this.yetkiler = yetkiler;
    }
}
