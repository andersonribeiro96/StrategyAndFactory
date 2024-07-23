package com.example.strategyfactory;

import org.springframework.stereotype.Component;

@Component
public class Evento01 implements ManipuladorDeEvento {

    @Override
    public void processar(Solicitacao solicitacao) {
        System.out.println("Processando evento 01");
    }
}
