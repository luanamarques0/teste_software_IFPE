import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ifpe.teste.integracao.Class.Investidor;

public class InvestidorTest {
    @Test
    public void testTransacaoComMaiorDeIdade() {
        Investidor investidoMaiorIdade = new Investidor("123.456.789-10", "Luana", 25, 100.0);

        assertTrue(investidoMaiorIdade.investidorDeMaior());
        assertEquals(500.00, investidoMaiorIdade.converterParaReal(), 0.01);
        assertEquals(490.0, investidoMaiorIdade.realizarTransacao(), 0.01);
    }

    @Test
    public void testTransacaoMenorIdade() {
        Investidor investidorMenorIdade = new Investidor("111.222.333-44", "Geovanna", 16, 100.0);

        assertFalse(investidorMenorIdade.investidorDeMaior());
        assertEquals(500.0, investidorMenorIdade.converterParaReal(), 0.01);
        assertEquals(0.0, investidorMenorIdade.realizarTransacao(), 0.01);

    }
}
