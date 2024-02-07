package com.eticaret.eticaret.Service;

import com.eticaret.eticaret.DTO.UrunDTO;
import com.eticaret.eticaret.DTO.UserDTO;

import java.util.List;

public interface UserServisi {
    List<UserDTO> getButunKullanicilar();
}
