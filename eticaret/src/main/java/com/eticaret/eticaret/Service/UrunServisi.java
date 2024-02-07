package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.DTO.UrunDTO;

import java.util.List;

public interface UrunServisi {
List<UrunDTO>getButunUrun();
void yeniUrunKaydet(UrunDTO urunDTOn);
UrunDTO getUrunId(Long id);
void guncelleTamamla(UrunDTO urunDTO);
void sil (Long num);


}
