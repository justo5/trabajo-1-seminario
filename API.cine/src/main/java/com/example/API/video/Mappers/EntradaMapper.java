package com.example.API.video.Mappers;

import com.example.API.video.Dtos.EntradaRequest;
import com.example.API.video.Dtos.EntradaResponses;
import com.example.API.video.Models.Entrada;
import com.example.API.video.Services.EntradaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;

public class EntradaMapper {

    @Autowired // inyeccion de dependencia
    private EntradaService entradaService;
    
    public Entrada entradarequest(EntradaRequest entradaRequest){
    Entrada entrada = new Entrada();
    entrada.setValor(entradaRequest.setValor());
    entrada.setAsientoNumero(entradaRequest.getAsientoNumero());
    return entrada;
    }

    public Entrada entradaResponses(EntradaResponses entradaResponses){
        Entrada entrada = new Entrada();
        entrada.setValor(entradaResponses.setValor());
        entrada.setAsientoNumero(entradaResponses.getAsientoNumero());
        return entrada;
    }
}
