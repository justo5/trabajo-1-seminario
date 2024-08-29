package com.example.API.video.Services;

import com.example.API.video.Models.Entrada;
import com.example.API.video.Repositories.IEntradaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service

public class EntradaService {

    @Autowired
    private IEntradaRepository iEntradaRepository;
    public Entrada guardarEntrada(Entrada entrada) {
    return iEntradaRepository.save(entrada);
    }


}
