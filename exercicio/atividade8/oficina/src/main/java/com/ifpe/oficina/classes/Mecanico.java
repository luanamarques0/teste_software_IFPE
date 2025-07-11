package com.ifpe.oficina.classes;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Mecanico {
    private String matricula;
    private String nome;
    private List<String> especialidades = new ArrayList<>();

    public Mecanico(String matricula, String nome, List<String> especialidades) {
        this.matricula = matricula;
        this.nome = nome;
        this.especialidades = (especialidades != null) ? especialidades : new ArrayList<>();
    }

    public boolean funcionarioPremium() {
        // return especialidades.size() > 2;
        return especialidades.size() > 1; //letra F
    }
}
