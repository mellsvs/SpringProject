package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.DTO.UrunDTO;
import com.eticaret.eticaret.Eslesme.Eslesme;
import com.eticaret.eticaret.Repository.UrunRepo;
import com.eticaret.eticaret.Veri.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UrunServisUyg implements UrunServisi{
    private UrunRepo urunRepo;
    @Autowired
    public UrunServisUyg(UrunRepo urunRepo) {
        this.urunRepo = urunRepo;
    }

    @Override
    public List<UrunDTO> getButunUrun() {
       List<Urun> urunListesi=urunRepo.findAll();
       List<UrunDTO>urunDTOListesi=urunListesi.stream().map((urun) -> Eslesme.urunDTOEsle(urun)).collect(Collectors.toList());
  return urunDTOListesi;
    }

    @Override
    public void yeniUrunKaydet(UrunDTO urunDTO) {
    Urun urun = Eslesme.urunEsle(urunDTO);
    urunRepo.save(urun);
    }

    @Override
    public UrunDTO getUrunId(Long id) {
       Urun urun = urunRepo.findById(id).get();
       UrunDTO urunDTO = Eslesme.urunDTOEsle(urun);
       return urunDTO;
    }

    @Override
    public void guncelleTamamla(UrunDTO urunDTO) {
urunRepo.save(Eslesme.urunEsle(urunDTO));
    }

    @Override
    public void sil(Long num) {
urunRepo.deleteById(num);
    }
}
