package com.ifpe.teste.integracao.Class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Investidor {
    private String cpf;
    private String nome;
    private int idade;
    private double valorInvestimento;

    public boolean investidorDeMaior() {
        if (idade >= 18) {
            return true;
        }

        return false;
    }

    public double converterParaReal() {
        if (valorInvestimento > 0) {
            return valorInvestimento * 5;
        }
        return 0;
    }

    public double realizarTransacao() {
        if (investidorDeMaior()) {
            double valorConvertido = converterParaReal();
            return valorConvertido - 10;
        }

        System.out.println("Menores de idade não podem transferir!");
        return 0;
    }
}
