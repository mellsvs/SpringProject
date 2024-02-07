package edu.obs.obs.Controller;

import edu.obs.obs.DTO.OgrenciDTO;
import edu.obs.obs.Service.OgrenciServisi;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.BindException;
import java.util.List;

@Controller
public class OgrenciKontroller {
    private OgrenciServisi ogrenciServisi;

    public OgrenciKontroller(OgrenciServisi ogrenciServisi) {
        this.ogrenciServisi = ogrenciServisi;
    }
    @GetMapping("/obsGetirHepsi")
    public String getirButunOgrenciler(Model model){
        List<OgrenciDTO> ogrencilerGetir = ogrenciServisi.getButunOgr();
        model.addAttribute("ogrenciler",ogrencilerGetir);
        return "getirOBSOgrHepsi";

    }
    @GetMapping("/yeniogr")
    public String yeniOgrenci(Model model){
        OgrenciDTO ogrenciDTO=new OgrenciDTO();
        model.addAttribute("ogrenci",ogrenciDTO);
        return "yeniOgrSayfasi";
    }
    @PostMapping("/ogrenciler")
    public String ogrenciyiKaydet(@Valid @ModelAttribute("ogrenci") OgrenciDTO ogrenciDTO, BindingResult result,Model model) {
        if (result.hasErrors()) {
            model.addAttribute("ogrenci", ogrenciDTO);
            return "/yeniOgrSayfasi";
        }
    ogrenciServisi.yeniOgrenciKaydet(ogrenciDTO);
        return "redirect:/obsGetirHepsi";
    }
@PostMapping("/ogrenciler/{id}")
    public String ogrenciGuncellemeTamamla(@PathVariable("id")Long num,@ModelAttribute("ogrenci")OgrenciDTO ogrenciDTO,BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("ogrenci",ogrenciDTO);
            return "guncelleOgrSayfasi";
        }
        ogrenciDTO.setNum(num);
        ogrenciServisi.guncelleTamamla(ogrenciDTO);
        return "redirect:/obsGetirHepsi";
}
@GetMapping("/ogrenciler/{id}/guncelle")
    public String ogrenciGuncelle(@PathVariable("id")Long num, Model model)
{
    OgrenciDTO ogrenci = ogrenciServisi.getOgrenciId(num);
    model.addAttribute("ogrenci",ogrenci);
    return "guncelleOgrSayfasi";
}
@GetMapping("/ogrenciler/{id}/goruntule")
    public String ogrenciGoruntule(@PathVariable("id") Long num, Model model){
        OgrenciDTO ogrenci = ogrenciServisi.getOgrenciId(num);
        model.addAttribute("ogrenci",ogrenci);
        return "goruntuleOgrSayfasi";
}
@GetMapping("/ogrenciler/{id}/sil")
    public String silOgrenci(@PathVariable("id")Long num){
        ogrenciServisi.sil(num);
        return "redirect:/obsGetirHepsi";
}
}
