import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.ifpe.oficina.classes.Mecanico;

public class MecanicoTest {
    @Test
    public void testFuncionarioPremium() {
        List<String> especialidades = new ArrayList<>();
        especialidades.add("Suspensão");
        especialidades.add("Freios");
        especialidades.add("Motor");

        Mecanico mecanico = new Mecanico("123", "João da Oficina", especialidades);

        assertTrue(mecanico.funcionarioPremium());
    }

    @Test
    public void testFalsoFuncionarioPremium() {
        List<String> especialidades = new ArrayList<>();
        especialidades.add("Suspensão");
        especialidades.add("Freios");

        Mecanico mecanico = new Mecanico("123", "João da Oficina", especialidades);

        assertFalse(mecanico.funcionarioPremium());
    }

    @Test
    public void testFuncionarioPremiumComEspecialidadesDuplicadas() {
        List<String> especialidades = new ArrayList<>();
        especialidades.add("Suspensão");
        especialidades.add("Suspensão");
        especialidades.add("Suspensão");
        especialidades.add("Suspensão");

        Mecanico mecanico = new Mecanico("123", "João da Oficina", especialidades);

        assertTrue(mecanico.funcionarioPremium());
    }
}
