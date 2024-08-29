package com.example.API.video.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table (name = "Entradas")

public class Entrada {

    @Id
    private int idEntrada;
    private int valor;
    private int asientoNumero;
}
