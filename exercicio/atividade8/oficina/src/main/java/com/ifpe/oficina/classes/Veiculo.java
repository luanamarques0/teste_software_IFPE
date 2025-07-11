package com.ifpe.oficina.classes;

import com.ifpe.oficina.enums.TipoCarro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    private String placa;
    private TipoCarro tipo;
    private int numOcorrencias;
    private int anoFabricacao;

    public int calcularGarantia() {
        if (tipo == null)
            return 0;

        int anosGarantia;

        switch (tipo) {
            case SUV -> anosGarantia = 3;
            case PICKUP -> anosGarantia = 5;
            case POPULAR -> anosGarantia = 2;
            default -> {
                return 0;
            }
        }

        return anoFabricacao + anosGarantia;
    }

}
