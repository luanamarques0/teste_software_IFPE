package com.atividade7.classes;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Biblioteca {
    private String nome;
    private String cnpj;
    private int anoFundacao;
    private List<Livro> listaLivros = new ArrayList<>();

    public Biblioteca(String nome, String cnpj, int anoFundacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.anoFundacao = anoFundacao;
        this.listaLivros = new ArrayList<>();
    }

    public boolean patrimonioHistorico() {
        return anoFundacao < 1980;
    }

    public void acrescentarLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public List<Livro> consultarLivros() {
        return listaLivros;
    }

    public void removerLivro(Livro livro) {
        listaLivros.remove(livro);
    }

    public boolean acervoPremium() {
        return listaLivros.stream()
                .filter(Livro::verificarLancamento)
                .count() >= 5;
    }


}
