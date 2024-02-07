package edu.guvenlik.login.Kontroller;

import edu.guvenlik.login.DTO.OgrenciDTO;
import edu.guvenlik.login.Servis.KayitServisi;
import jakarta.persistence.GeneratedValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AnaKontroller {
    private KayitServisi kayitServisi;

    public AnaKontroller(KayitServisi kayitServisi) {
        this.kayitServisi = kayitServisi;
    }
@PostMapping("/kaydet") // th action ile aynı olmalı
public String yeniKayitKaydet(@ModelAttribute("ogrenciDTO") OgrenciDTO ogrenciDTO){
        kayitServisi.kaydet(ogrenciDTO);
        return "redirect:/yeniKayit?success*";
}

    @GetMapping("/anaSayfa")
    public String anaSayfa(){
        return "AnaSayfa";
    }
    @GetMapping("/yeniKayit")
        public String yeniKayit(Model model){
            OgrenciDTO ogrenciDTO = new OgrenciDTO();
            model.addAttribute("ogrenciDTO",ogrenciDTO);
            return "yeniKayitSayfasi";
        }

        @GetMapping("/listele")
    public String listele(Model model){
        List<OgrenciDTO> ogrencilerDTO=kayitServisi.butunListe();
        model.addAttribute("ogrenciler",ogrencilerDTO);
        return "listeleSayfasi";
        }


}
