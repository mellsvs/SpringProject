package com.example.dtoDenemesi.Service;

import com.example.dtoDenemesi.DTO.OgrenciDTO;
import com.example.dtoDenemesi.DTO.OgrenciEsleme;
import com.example.dtoDenemesi.Entity.Ogrenci;
import com.example.dtoDenemesi.Repository.OgrenciRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service @AllArgsConstructor
public class OgrenciAraciImplementasyonu implements OgrenciAraci {
    private OgrenciRepo ogrenciRepo;
    public Ogrenci yeniOgrenci(Ogrenci ogrenci) {
        return ogrenciRepo.save(ogrenci);
    }

    public OgrenciDTO yeni1Ogrenci(OgrenciDTO ogrenciDTO){
        Ogrenci ogr = OgrenciEsleme.ogrenciEsle(ogrenciDTO);
        Ogrenci yeniKayit=ogrenciRepo.save(ogr);
        OgrenciDTO yeniKatirDTO=OgrenciEsleme.ogrenciDTOesle(yeniKayit);
        return  yeniKatirDTO;


    }
    @Override
    public OgrenciDTO yeniOgrenci(OgrenciDTO ogrenciDTO) {
        Ogrenci ogr1=new Ogrenci(
                ogrenciDTO.getId(),
                ogrenciDTO.getAd(),
                ogrenciDTO.getSoyad()
        );
        Ogrenci yeniKayit=ogrenciRepo.save(ogr1);
        OgrenciDTO yeniKayitDTO=new OgrenciDTO(
                yeniKayit.getId(),
                yeniKayit.getAd(),
                yeniKayit.getSoyad()
        );

        return yeniKayitDTO;
    }

    @Override
    public OgrenciDTO getirOgrenci(Long ogrenciId) {
        Optional<Ogrenci> ogrenciOptional = ogrenciRepo.findById(ogrenciId);

        if (ogrenciOptional.isPresent()) {
            Ogrenci ogrenci = ogrenciOptional.get();
            return OgrenciEsleme.ogrenciDTOesle(ogrenci);
        } else {
            // Öğrenci bulunamadı durumu için isteğe bağlı olarak bir işlem yapabilirsiniz.
            // Örneğin, ResponseEntity.notFound().build() kullanarak 404 Not Found dönebilirsiniz.
            return null; // veya throw new NoSuchElementException("Öğrenci bulunamadı") gibi bir hata fırlatabilirsiniz.
        }
    }

    @Override
    public List<OgrenciDTO> getirOgrenciler() {
        List<Ogrenci> ogrenci=ogrenciRepo.findAll();


        return ogrenci.stream().map(OgrenciEsleme::ogrenciDTOesle).collect(Collectors.toList());
    }

    @Override
    public OgrenciDTO guncelleOgrenci(OgrenciDTO ogrenci) {
        Ogrenci guncelle =ogrenciRepo.findById(ogrenci.getId()).get();
        guncelle.setAd(ogrenci.getAd());
        guncelle.setSoyad(ogrenci.getSoyad());
        Ogrenci ogrguncelle=ogrenciRepo.save(guncelle);

        return OgrenciEsleme.ogrenciDTOesle(ogrguncelle);
    }

    @Override
    public void silOgrenci(Long ogrenciId) {

    }
}
