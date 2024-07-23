package com.example.strategyfactory;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ManipuladorDeEventoFactory {

    private final Map<String, ManipuladorDeEvento> eventos = new HashMap<>();

    public ManipuladorDeEventoFactory() {
        Evento01 evento01 = new Evento01();
        Evento02 evento02 = new Evento02();
        this.eventos.put("01", evento01);
        this.eventos.put("02", evento02);
    }

    public ManipuladorDeEvento obterManipulador(String codigoEvento) {
        return this.eventos.get(codigoEvento);
    }

}
