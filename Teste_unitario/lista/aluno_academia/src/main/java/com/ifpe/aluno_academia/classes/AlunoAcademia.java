package com.ifpe.aluno_academia.classes;

import com.ifpe.aluno_academia.enums.Sexo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoAcademia {
    private String nome;
    private Sexo sexo;
    private double peso;
    private double altura;
    private int idade;

    public double calculoImc() {

        if(altura <= 0){
            throw new ArithmeticException("Altura invalida");
        }
        
        double imc = peso / (altura * altura);

        return Math.round(imc * 100.0) / 100.0;
    }

    public boolean VIP() {
        double imc = calculoImc();

        if (sexo == Sexo.MASCULINO) {
            return (idade >= 40 && imc < 30) || (idade < 40 && imc < 28);

        } else if (sexo == Sexo.FEMININO) {
            return (idade >= 40 && imc < 28) || (idade < 40 && imc < 26);

        }
        
        return false;
    }

}
