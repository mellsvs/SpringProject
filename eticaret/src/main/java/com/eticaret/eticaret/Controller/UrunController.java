package com.eticaret.eticaret.Controller;

import com.eticaret.eticaret.DTO.UrunDTO;
import com.eticaret.eticaret.DTO.UserDTO;
import com.eticaret.eticaret.Service.UrunServisi;
import com.eticaret.eticaret.Service.UserServisi;
import com.eticaret.eticaret.Veri.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UrunController {
    private UrunServisi urunServisi;
   private UserServisi userServisi;

    public UrunController(UrunServisi urunServisi, UserServisi userServisi) {
        this.urunServisi = urunServisi;
        this.userServisi = userServisi;
    }

    @GetMapping("/urunGetirHepsi")
    public String getirButunUrunler(Model model){
        List<UrunDTO> urunGetir = urunServisi.getButunUrun();
        model.addAttribute("urunler",urunGetir);
        return "getirUrunHepsi";
    }
    @GetMapping("/AdminUrunGetir")
    public String getirAdminButunUrunler(Model model){
        List<UserDTO> kullanicilar = userServisi.getButunKullanicilar();
        model.addAttribute("kullanici",kullanicilar);
        return "AdminGoruntule";
    }
    @GetMapping("/yeniurun")
    public String yeniUrun(Model model){
        UrunDTO urunDTO = new UrunDTO();
        model.addAttribute("urun",urunDTO);
        return "yeniUrunSayfasi";
    }
    @PostMapping("/urunler")
    public String urunKaydet(@Valid @ModelAttribute("urun") UrunDTO urunDTO, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("urun", urunDTO);
            return "/yeniUrunSayfasi";
        }
        urunServisi.yeniUrunKaydet(urunDTO);
        return "redirect:/urunGetirHepsi";
    }
    @PostMapping("/urunler/{id}")
    public String urunGuncellemeTamamla(@PathVariable("id")Long num, @ModelAttribute("urun")UrunDTO urunDTO, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("urun",urunDTO);
            return "guncelleUrunSayfasi";
        }
        urunDTO.setNum(num);
        urunServisi.guncelleTamamla(urunDTO);
        return "redirect:/urunGetirHepsi";
    }
    @GetMapping("/urunler/{id}/guncelle")
    public String urunGuncelle(@PathVariable("id")Long num, Model model)
    {
        UrunDTO urun = urunServisi.getUrunId(num);
        model.addAttribute("urun",urun);
        return "guncelleUrunSayfasi";
    }
    @GetMapping("/urunler/{id}/goruntule")
    public String urunGoruntule(@PathVariable("id") Long num, Model model){
        UrunDTO urun = urunServisi.getUrunId(num);
        model.addAttribute("urun",urun);
        return "goruntuleUrunSayfasi";
    }
    @GetMapping("/urunler/{id}/sil")
    public String silUrun(@PathVariable("id")Long num){
        urunServisi.sil(num);
        return "redirect:/urunGetirHepsi";
    }

}
