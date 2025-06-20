package com.ifpe.aluno_academia;

import com.ifpe.aluno_academia.classes.AlunoAcademia;
import com.ifpe.aluno_academia.enums.Sexo;

public class Main {
    public static void main(String[] args) {

        AlunoAcademia aluno = new AlunoAcademia("João", Sexo.MASCULINO, 80, 1.80, 30);
        double imc = aluno.calculoImc();

        System.out.println(imc);
    }
}