package com.atividade7.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Livro {
    private String nome;
    private int edicao;
    private String autor;
    private String isbn;

    public boolean verificarLancamento() {
        return edicao > 2022;
    }

}
