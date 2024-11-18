package com.api.orcamento.contrato;

import com.api.orcamento.model.Orcamento;

public interface Imposto {
    double calcula(Orcamento orcamento);
}
