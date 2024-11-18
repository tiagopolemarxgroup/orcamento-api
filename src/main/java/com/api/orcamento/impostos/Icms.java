package com.api.orcamento.impostos;

import com.api.orcamento.contrato.Imposto;
import com.api.orcamento.model.Orcamento;

public class Icms implements Imposto {
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

}
