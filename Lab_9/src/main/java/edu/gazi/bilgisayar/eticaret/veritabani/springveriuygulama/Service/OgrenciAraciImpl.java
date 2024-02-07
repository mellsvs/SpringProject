package edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Service;

import edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Entity.Ogrenci;
import edu.gazi.bilgisayar.eticaret.veritabani.springveriuygulama.Repository.OgrenciRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OgrenciAraciImpl implements OgrenciAraci{
    private OgrenciRepo ogrenciRepo;

    public OgrenciAraciImpl(OgrenciRepo ogrenciRepo) {
        this.ogrenciRepo = ogrenciRepo;
    }

    @Override
    public Ogrenci yeniOgrenci(Ogrenci ogrenci) {
        return ogrenciRepo.save(ogrenci);
    }

    @Override
    public Ogrenci getOgrenci(Long ogrenciId) {
        Optional<Ogrenci> ogrenciGetir = ogrenciRepo.findById(ogrenciId);
        return ogrenciGetir.get();
    }

    @Override
    public void deleteOgrenci(Long ogrenciId) {
        ogrenciRepo.deleteById(ogrenciId);
    }

    @Override
    public Ogrenci updateOgrenci(Ogrenci ogrenci) {
        Ogrenci guncelle=ogrenciRepo.findById(ogrenci.getId()).get();
        guncelle.setAd(ogrenci.getAd());
        guncelle.setSoyad(ogrenci.getSoyad());
        guncelle.setYas(ogrenci.getYas());
        Ogrenci guncellenenOgrenci=ogrenciRepo.save(guncelle);
        return guncellenenOgrenci;
    }

    @Override
    public List<Ogrenci> getAllOgrenci() {
        return ogrenciRepo.findAll();
    }
}
