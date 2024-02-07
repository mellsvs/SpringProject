package com.example.veriTabaniBaglantisi.Veri;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity @Table(name="ogrenciler")
public class Ogrenci {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ad;
    private String soyad;

}
