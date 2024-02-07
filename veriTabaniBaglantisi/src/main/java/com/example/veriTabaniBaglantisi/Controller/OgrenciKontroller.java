package com.example.veriTabaniBaglantisi.Controller;

import com.example.veriTabaniBaglantisi.Servis.OgrenciAraci;
import com.example.veriTabaniBaglantisi.Veri.Ogrenci;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.veriTabaniBaglantisi.Servis.OgrenciAraci;

import java.util.List;

@RestController
public class OgrenciKontroller {
    private OgrenciAraci ogrenciAraci;

    @PostMapping("uygulama/ilkKayit")
    public ResponseEntity<Ogrenci>yeniOgrenci(@RequestBody Ogrenci ogrenci){
        Ogrenci ogrenciKayit = ogrenciAraci.yeniOgrenci(ogrenci);
        return new ResponseEntity<>(ogrenciKayit, HttpStatus.CREATED);
    }
    @GetMapping("uygulama/getOgrenci/{id}")
    public ResponseEntity<Ogrenci> getOgrenci(@PathVariable("id") Long ogrenciId){
        Ogrenci getirilenOgrenci = ogrenciAraci.getOgrenci(ogrenciId);
        return new ResponseEntity<>(getirilenOgrenci, HttpStatus.OK);
    }

    @DeleteMapping("uygulama/deleteOgrenci/{id}")
    public ResponseEntity<Ogrenci> deleteOgrenci(@PathVariable("id") Long ogrenciId){
        ogrenciAraci.deleteOgrenci(ogrenciId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("uygulama/kayitGuncelle/{id}")
    public ResponseEntity<Ogrenci> updateOgrenci(@PathVariable("id") Long ogrenciId, @RequestBody Ogrenci ogrenci){
        ogrenci.setId(ogrenciId);
        Ogrenci guncelOgrenci = ogrenciAraci.updateOgrenci(ogrenci);
        return new ResponseEntity<>(guncelOgrenci, HttpStatus.OK);
    }

    @GetMapping("uygulama/getAll")
    public ResponseEntity<List<Ogrenci>> getAllOgrenci(){
        List<Ogrenci> ogrenciList=ogrenciAraci.getAllOgrenci();
        return new ResponseEntity<>(ogrenciList,HttpStatus.OK);
    }

}
