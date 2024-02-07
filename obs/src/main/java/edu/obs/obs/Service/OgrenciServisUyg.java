package edu.obs.obs.Service;

import edu.obs.obs.DTO.OgrenciDTO;
import edu.obs.obs.Eslesme.Eslesme;
import edu.obs.obs.Repository.OgrenciRepo;
import edu.obs.obs.Veri.Ogrenci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class OgrenciServisUyg implements OgrenciServisi{
    private OgrenciRepo ogrenciRepo;
    @Autowired
    public OgrenciServisUyg(OgrenciRepo ogrenciRepo){
        this.ogrenciRepo= ogrenciRepo;
    }
    @Override
    public List<OgrenciDTO>getButunOgr(){
        List<Ogrenci> ogrenciListesi=ogrenciRepo.findAll();
        List<OgrenciDTO> ogrenciDTOLisesi=ogrenciListesi.stream().map((ogrenci) -> Eslesme.ogrenciDTOEsle(ogrenci)).collect(Collectors.toList());
        return ogrenciDTOLisesi;

    }

    @Override
    public void yeniOgrenciKaydet(OgrenciDTO ogrenciDTO) {
        Ogrenci ogrenci =Eslesme.ogrenciEsle(ogrenciDTO);
        ogrenciRepo.save(ogrenci);
    }

    @Override
    public OgrenciDTO getOgrenciId(Long id) {
        Ogrenci ogrenci =ogrenciRepo.findById(id).get();
        OgrenciDTO ogrenciDTO =Eslesme.ogrenciDTOEsle(ogrenci);
        return ogrenciDTO;
    }

    @Override
    public void guncelleTamamla(OgrenciDTO ogrenciDTO) {
        ogrenciRepo.save(Eslesme.ogrenciEsle(ogrenciDTO));

    }

    @Override
    public void sil(Long num) {
        ogrenciRepo.deleteById(num);
    }


}
