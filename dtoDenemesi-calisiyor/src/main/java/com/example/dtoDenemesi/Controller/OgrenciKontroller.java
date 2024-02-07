package com.example.dtoDenemesi.Controller;

import com.example.dtoDenemesi.DTO.OgrenciDTO;
import com.example.dtoDenemesi.Entity.Ogrenci;
import com.example.dtoDenemesi.Service.OgrenciAraci;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @AllArgsConstructor
public class OgrenciKontroller {
    private OgrenciAraci araci;

    @PostMapping("/dtoKayit")
    public ResponseEntity<OgrenciDTO> yeniOgrenci (@RequestBody OgrenciDTO ogrenci){
        OgrenciDTO ogrenciKayit = araci.yeniOgrenci(ogrenci);
        return new ResponseEntity<>(ogrenciKayit, HttpStatus.CREATED);
    }
    @GetMapping("/ilkGetir/{id}")
    public ResponseEntity<OgrenciDTO> getirOgrenci(@PathVariable("id")Long ogrenciId){
        OgrenciDTO ogrenciGetir= araci.getirOgrenci(ogrenciId);
        return new ResponseEntity<>(ogrenciGetir,HttpStatus.OK);

    }

    @GetMapping("/ilkGetirHepsi")
    public ResponseEntity<List<OgrenciDTO>> getirButunOgrenciler(){
        List<OgrenciDTO>ogrencilerGetir = araci.getirOgrenciler();
        return new ResponseEntity<>(ogrencilerGetir,HttpStatus.OK);
    }
    @PutMapping("/ilkguncelle/{id}")
    public ResponseEntity<OgrenciDTO>guncelleOgrenci(@PathVariable("id")Long ogrenciId,@RequestBody OgrenciDTO ogrenci)
    {
        ogrenci.setId(ogrenciId);
        OgrenciDTO ogrenciGuncelle = araci.guncelleOgrenci(ogrenci);
        return new ResponseEntity<>(ogrenciGuncelle,HttpStatus.OK);
    }
    @DeleteMapping("ilkSil/{id}")
    public ResponseEntity<String>silOgrenci(@PathVariable("id")Long ogrenciId){
        araci.silOgrenci(ogrenciId);
        return  new ResponseEntity<>("ogrenci silindi",HttpStatus.OK);
    }
}
