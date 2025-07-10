package com.atividade7.classes;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pedidos {
    private List<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Produto prod) {
        if (prod.getPreco() < 0) {
            throw new IllegalArgumentException("Produto com preço negativo não pode ser adicionado.");
        }
        listaProdutos.add(prod);
    }

    public void removerProduto(Produto prod) {
        listaProdutos.remove(prod);
    }

    public int quantidadeProdutos() {
        return listaProdutos.size();
    }

    public List<Produto> exibirListaProdutos() {
        return listaProdutos;
    }

}
