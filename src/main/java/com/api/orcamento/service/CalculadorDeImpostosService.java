package com.api.orcamento.service;

import com.api.orcamento.contrato.Imposto;
import com.api.orcamento.impostos.Icms;
import com.api.orcamento.impostos.Iss;
import com.api.orcamento.model.Orcamento;

public class CalculadorDeImpostosService {
   public void realizaCalculo(Orcamento orcamento, Imposto imposto) {

           double icms = new Icms().calcula(orcamento);
           System.out.println("IMPOSTO: icms " + icms);
           double iss = new Iss().calcula(orcamento);
           System.out.println("imposto iss: " + iss);
   }
}
