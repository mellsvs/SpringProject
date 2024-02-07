package edu.guvenlik.login.Servis;

import edu.guvenlik.login.DTO.OgrenciDTO;

import java.util.List;

public interface KayitServisi {
void kaydet(OgrenciDTO ogrenciDTO);

    List<OgrenciDTO> butunListe();
}
