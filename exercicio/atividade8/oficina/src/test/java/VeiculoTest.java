import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ifpe.oficina.classes.Veiculo;
import com.ifpe.oficina.enums.TipoCarro;

public class VeiculoTest {
    @Test
    public void testCalcularGarantia() {
        Veiculo suv = new Veiculo("ABC-1234", TipoCarro.SUV, 2, 2021);
        Veiculo pickup = new Veiculo("DEF-5678", TipoCarro.PICKUP, 1, 2020);
        Veiculo popular = new Veiculo("GHI-9012", TipoCarro.POPULAR, 0, 2022);
        Veiculo extra = new Veiculo("JKL-3456", null, 7, 2017);

        assertEquals(2024, suv.calcularGarantia());
        assertEquals(2025, pickup.calcularGarantia());
        assertEquals(2024, popular.calcularGarantia());
        assertEquals(0, extra.calcularGarantia());
    }

}
