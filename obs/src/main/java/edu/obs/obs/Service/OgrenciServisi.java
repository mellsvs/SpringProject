package edu.obs.obs.Service;

import edu.obs.obs.DTO.OgrenciDTO;

import java.util.List;

public interface OgrenciServisi {
    List<OgrenciDTO> getButunOgr();
    void yeniOgrenciKaydet(OgrenciDTO ogrenciDTO);
    OgrenciDTO getOgrenciId(Long id);
    void guncelleTamamla(OgrenciDTO ogrenciDTO);
    void sil(Long num);



}
