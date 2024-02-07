package edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Controller;

import edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Entity.Ogrenci;
import edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Service.OgrenciAraci;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OgrenciController {
    private OgrenciAraci ogrenciAraci;

    public OgrenciController(OgrenciAraci ogrenciAraci) {
        this.ogrenciAraci = ogrenciAraci;
    }

    @PostMapping("uygulama/yeniKayit")
    public ResponseEntity<Ogrenci> YeniOgrenci(@RequestBody Ogrenci ogrenci){
        Ogrenci yeniKayit = ogrenciAraci.yeniOgrenci(ogrenci);
        return new ResponseEntity<>(yeniKayit, HttpStatus.CREATED);
    }

    @GetMapping("uygulama/getOgrenci/{id}")
    public ResponseEntity<Ogrenci> GetOgrenciById(@PathVariable("id") Long ogrenciId){
        Ogrenci getirilenOgrenci = ogrenciAraci.getOgrenci(ogrenciId);
        return new ResponseEntity<>(getirilenOgrenci, HttpStatus.OK);
    }

    @DeleteMapping("uygulama/deleteOgrenci/{id}")
    public ResponseEntity<Ogrenci> DeleteOgrenciById(@PathVariable("id") Long ogrenciId){
        ogrenciAraci.deleteOgrenci(ogrenciId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("uygulama/kayitGuncelle/{id}")
    public ResponseEntity<Ogrenci> GuncelleOgrenci(@PathVariable("id") Long ogrenciId, @RequestBody Ogrenci ogrenci){
        ogrenci.setId(ogrenciId);
        Ogrenci guncelOgrenci = ogrenciAraci.updateOgrenci(ogrenci);
        return new ResponseEntity<>(guncelOgrenci, HttpStatus.OK);
    }

    @GetMapping("uygulama/getAll")
    public ResponseEntity<List<Ogrenci>> GetAllOgrenci(){
        List<Ogrenci> ogrenciList=ogrenciAraci.getAllOgrenci();
        return new ResponseEntity<>(ogrenciList,HttpStatus.OK);
    }
}
