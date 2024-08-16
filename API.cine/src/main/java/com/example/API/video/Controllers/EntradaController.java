package com.example.API.video.Controllers;

import com.example.API.video.Dtos.EntradaRequest;
import com.example.API.video.Models.Entrada;
import com.example.API.video.Services.EntradaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class EntradaController {

    private EntradaService entradaService;
    //@PostMapping("/Create")
    public ResponseEntity <Entrada>crearEntrada(@RequestBody EntradaRequest entradaRequest){
        Entrada entrada = new Entrada();
        entrada.setValor(entradaRequest.getValor());
        entrada.setAsientoNumero(entradaRequest.getAsientoNumero());
        Entrada guardarEntrada = entradaService.guardarEntrada(entrada);
        return new ResponseEntity<Entrada>(guardarEntrada, HttpStatus.CREATED);

    }
}
