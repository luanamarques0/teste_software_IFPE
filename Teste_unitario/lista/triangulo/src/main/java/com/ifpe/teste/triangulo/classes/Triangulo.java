package com.ifpe.teste.triangulo.classes;

import com.ifpe.teste.triangulo.enums.TipoTriangulo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Triangulo {
    private double ladoUm;
    private double ladoDois;
    private double ladoTres;

    public TipoTriangulo classificacaoTriangulos(){

        if(!ladosValidos()){
            return TipoTriangulo.INVALIDO;
        }

        if (!trianguloValido()) {
            return TipoTriangulo.INVALIDO;
        }

        if (ladoUm == ladoDois && ladoUm == ladoTres) {
            return TipoTriangulo.EQUILATERO;

        } else if ( ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {
            return TipoTriangulo.ISOSCELES;

        } else {
            return TipoTriangulo.ESCALENO;

        }
    }

    public boolean trianguloValido(){
        return (ladoUm + ladoDois > ladoTres)
            && (ladoUm + ladoTres > ladoDois)
            && (ladoDois + ladoTres > ladoUm);
    }

    public boolean ladosValidos() {
        return (ladoUm > 0 && ladoDois > 0 && ladoTres > 0);
    }

    //Exercicio 8
    public double calcularPerimetro() {
        return (ladoUm + ladoDois + ladoTres);
    }
}
