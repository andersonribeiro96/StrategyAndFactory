package com.example.strategyfactory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StrategyEfactoryApplication {

    public static void main(String[] args) {

        ManipuladorDeEventoFactory manipuladorDeEventoFactory = new ManipuladorDeEventoFactory();
        List<Solicitacao> solicitacoes = new ArrayList<>();
        solicitacoes.add(new Solicitacao("01"));
        solicitacoes.add(new Solicitacao("02"));

        solicitacoes.forEach(solicitacao -> {
            ManipuladorDeEvento manipuladorDeEvento = manipuladorDeEventoFactory.obterManipulador(solicitacao.getCodigoEvento());
            manipuladorDeEvento.processar(solicitacao);
        });

    }

}
