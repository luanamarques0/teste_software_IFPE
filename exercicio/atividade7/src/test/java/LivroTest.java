import org.junit.jupiter.api.Test;

import com.atividade7.classes.Livro;

import static org.junit.jupiter.api.Assertions.*;

public class LivroTest {

    @Test
    public void testVerificaLancamento() {
        Livro livroAntigo = new Livro("harry potter e o cálice de fogo", 2000, "J. K. Rowling", "123");
        Livro livroNovo = new Livro("Como se tornar um cristão inútil", 2025, "Rodrigo Bibo", "456");

        assertTrue(livroNovo.verificarLancamento());
        assertFalse(livroAntigo.verificarLancamento());
    }
}
