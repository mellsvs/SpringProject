package edu.guvenlik.login.Veri;

import jakarta.persistence.*;
import org.hibernate.type.descriptor.java.YearJavaType;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Yetki {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;
private String yetkiAd;
@ManyToMany(mappedBy = "yetkiler")
    private List<Ogrenci> ogrenciler = new ArrayList<>();
public Yetki(){}

    public Yetki(Long num, String yetkiAd, List<Ogrenci> ogrenciler) {
        this.num = num;
        this.yetkiAd = yetkiAd;
        this.ogrenciler = ogrenciler;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getYetkiAd() {
        return yetkiAd;
    }

    public void setYetkiAd(String yetkiAd) {
        this.yetkiAd = yetkiAd;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }
}

