package com.example.strategyfactory;

import lombok.Data;

@Data
public class Solicitacao {

    private String codigoEvento;
    private String descricao;
    private String solicitante;
    private String status;

    public Solicitacao(String codigoEvento) {
        this.codigoEvento = codigoEvento;
    }
}
