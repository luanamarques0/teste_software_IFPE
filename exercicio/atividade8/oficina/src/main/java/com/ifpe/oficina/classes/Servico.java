package com.ifpe.oficina.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Servico {
    private static int proximoId = 1;

    private int id;
    private String motivo;
    private Mecanico mecanico;
    private Veiculo veiculo;

    public Servico(String matriculaMecanico, String placaVeiculo) {
        this.id = proximoId++;

        this.mecanico = new Mecanico();
        mecanico.setMatricula(matriculaMecanico);

        this.veiculo = new Veiculo();
        veiculo.setPlaca(placaVeiculo);
        veiculo.setNumOcorrencias(0);

    }

    public void ordemServico(String motivo) {
        this.motivo = motivo;
        veiculo.setNumOcorrencias(veiculo.getNumOcorrencias() + 1);
    }

}
