package com.example.demo.Controller;

import com.example.demo.ifadeler.Ogrenci;
import com.example.demo.ifadeler.YeniOgrenci;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ilkKontroller {
@GetMapping("/ilk")
    public String ilkmetod(Model model) {
        model.addAttribute("mesaj","merhaba");
        return "sayfa";
}

@GetMapping("/degisken")
    public String degiskenifade(Model model){
    Ogrenci ogrenci= new Ogrenci("meltem","savas",22,1,2,3);
    model.addAttribute("degisken",ogrenci);
    return "degiskenSayfa";
}
    @GetMapping("/secim")
    public String secimifade(Model model){
        Ogrenci ogrenci= new Ogrenci("meltem","savas",22,1,2,3);
        model.addAttribute("secim",ogrenci);
        return "secimSayfa";
    }

    @GetMapping("/i18n")
    public String i18nifade(){

        return "i18n";
    }
    @GetMapping("/link")
    public String linkifade(Model model){
    model.addAttribute("ad","savas");
        return "linkSayfa";
    }
    @GetMapping("/parca")
    public String parcaifade(){
    return "parcaSayfa";
    }

    @GetMapping("/iterasyon")
    public String iterasyonOrnek(Model model){
    Ogrenci ogrenci = new Ogrenci("meltem","savas",72,1,7,9);
    Ogrenci ogrenci1 = new Ogrenci("derin","deli",1,4,8,1);
    Ogrenci ogrenci2 = new Ogrenci("melike","savas",22,1,2,5);
    Ogrenci ogrenci3 = new Ogrenci("esra","kece",42,1,4,6);
    List<Ogrenci>liste= new ArrayList<>();
    liste.add(ogrenci);
    liste.add(ogrenci1);
    liste.add(ogrenci2);
    liste.add(ogrenci3);
    model.addAttribute("ogrenciiter",liste);
    return "iterasyonSayfa";
    }
    @GetMapping("/kosul")
    public String kosulOrnek(Model model){
        Ogrenci ogrenci = new Ogrenci("meltem","savas",72,1,7,9);
        Ogrenci ogrenci1 = new Ogrenci("derin","deli",1,4,8,1);
        Ogrenci ogrenci2 = new Ogrenci("melike","savas",22,1,2,5);
        Ogrenci ogrenci3 = new Ogrenci("esra","kece",42,1,4,6);
        List<Ogrenci>liste= new ArrayList<>();
        liste.add(ogrenci);
        liste.add(ogrenci1);
        liste.add(ogrenci2);
        liste.add(ogrenci3);
        model.addAttribute("ogrencikosul",liste);
        return "kosulSayfa";
    }
    @GetMapping("/yeniOgrenciKayit")
    public String ogrenciKayitSayfasi(Model model){
        YeniOgrenci yeniOgrenci = new YeniOgrenci();
        model.addAttribute("yeniogr",yeniOgrenci);
        List<String> liste = Arrays.asList("Adana","Ankara","Istanbul");
        model.addAttribute("listeEklenmis",liste);
        return "yeniKayitSayfa";
    }

    @PostMapping("/kaydet")
    public String ogrenciKaydet(Model model, @ModelAttribute("yeniogr") YeniOgrenci yeniOgrenci){
        model.addAttribute("<yeniogr>",yeniOgrenci);
        return "kayitBasariliSayfasi";
}

}
