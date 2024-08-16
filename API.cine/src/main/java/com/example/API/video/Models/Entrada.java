package com.example.API.video.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table (name = "Entradas") // Nombre de la tabla en la base de datos

public class Entrada {

    private int idEntrada;
    private int valor;
    private int asientoNumero;
}
