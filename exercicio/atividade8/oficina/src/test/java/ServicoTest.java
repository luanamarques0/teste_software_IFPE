import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ifpe.oficina.classes.Servico;

public class ServicoTest {
    @Test
    public void testOrdemServico() {
        Servico servico = new Servico("Mec123", "abc-1234");

        assertEquals(0, servico.getVeiculo().getNumOcorrencias());

        servico.ordemServico("Troca de oleo");

        assertEquals(1, servico.getVeiculo().getNumOcorrencias());

        assertEquals("Troca de oleo", servico.getMotivo());
    }
}

