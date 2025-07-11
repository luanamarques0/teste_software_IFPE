package com.atividade7.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gestao {
    private Pedidos pedido;

    public double valorTotalVendas() {
        double total = 0.0;


        for (Produto p : pedido.exibirListaProdutos()) {
            total += p.getPreco();
        }

        return total;
    }

}
