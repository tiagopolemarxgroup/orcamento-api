package com.api.orcamento;

import com.api.orcamento.contrato.Imposto;
import com.api.orcamento.impostos.Icms;
import com.api.orcamento.impostos.Iss;
import com.api.orcamento.model.Orcamento;
import com.api.orcamento.service.CalculadorDeImpostosService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrcamentoApplication implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Imposto iss = new Iss();
        Imposto icms = new Icms();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorDeImpostosService calculador = new CalculadorDeImpostosService();
        calculador.realizaCalculo(orcamento, iss);
        calculador.realizaCalculo(orcamento, icms);




    }

    public static void main(String[] args) {
        SpringApplication.run(OrcamentoApplication.class, args);
    }

}
