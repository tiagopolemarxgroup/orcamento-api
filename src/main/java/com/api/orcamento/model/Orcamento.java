package com.api.orcamento.model;

import lombok.Getter;

@Getter
public class Orcamento {
    private Double valor;

    public Orcamento(Double valor) {
        this.valor = valor;
    }
}
