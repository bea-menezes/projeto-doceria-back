package com.example.doce.doceria.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "doces")
@Data
public class Doce {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeDoce;
    private String image;
    private Double valor;

}
