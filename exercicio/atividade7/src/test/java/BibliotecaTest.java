import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.atividade7.classes.Biblioteca;
import com.atividade7.classes.Livro;

public class BibliotecaTest {

    @Test
    public void testPatrimonioHistorico() {
        Biblioteca central = new Biblioteca("Central", "00.000.000/0001-00", 1975);
        Biblioteca moderna = new Biblioteca("Moderna", "11.111.111/0001-11", 2000);

        assertTrue(central.patrimonioHistorico());
        assertFalse(moderna.patrimonioHistorico());
    }

    @Test
    public void testArcevoPremium() {
        Biblioteca central = new Biblioteca("Central", "00.000.000/0001-00", 1975);
        Biblioteca moderna = new Biblioteca("Moderna", "11.111.111/0001-11", 2000);

        Livro hp1 = new Livro("Harry Potter e a Pedra Filosofal", 2023, "J. K. Rowling", "9788532531704");
        Livro hp2 = new Livro("Harry Potter e a Câmara Secreta", 2023, "J. K. Rowling", "9781408883741");
        Livro hp3 = new Livro("Harry Potter e o Prisioneiro de Azkaban", 2023, "J. K. Rowling", "9781526618313");
        Livro hp4 = new Livro("Harry Potter e as Relíquias da Morte", 2023, "J. K. Rowling", "00008532512941");
        Livro hp5 = new Livro("Harry Potter e a Ordem da Fênix", 2023, "J. K. Rowling", "9780747551003");
        Livro hp6 = new Livro("Harry Potter e o Enigma do Príncipe", 2023, "J. K. Rowling", "9780747581086");
        Livro hp7 = new Livro("Harry Potter e as Relíquias da Morte", 2023, "J. K. Rowling", "9780747591054");

        Livro cl1 = new Livro("O Leão, a Feiticeira e o Guarda-Roupa", 1950, "C. S. Lewis", "9780064471046");
        Livro cl2 = new Livro("Príncipe Caspian", 1951, "C. S. Lewis", "9780064471053");
        Livro cl3 = new Livro("A Viagem do Peregrino da Alvorada", 1952, "C. S. Lewis", "9780064471060");
        Livro cl4 = new Livro("A Cadeira de Prata", 1953, "C. S. Lewis", "9780064471077");

        moderna.acrescentarLivro(hp1);
        moderna.acrescentarLivro(hp2);
        moderna.acrescentarLivro(hp3);
        moderna.acrescentarLivro(hp4);
        moderna.acrescentarLivro(hp5);
        moderna.acrescentarLivro(hp6);
        moderna.acrescentarLivro(hp7);

        central.acrescentarLivro(cl1);
        central.acrescentarLivro(cl2);
        central.acrescentarLivro(cl3);
        central.acrescentarLivro(cl4);

        assertTrue(moderna.acervoPremium());
        assertFalse(central.acervoPremium());
    }
}
