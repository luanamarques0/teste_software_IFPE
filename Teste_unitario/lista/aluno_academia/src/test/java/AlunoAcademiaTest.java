import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.ifpe.aluno_academia.classes.AlunoAcademia;
import com.ifpe.aluno_academia.enums.Sexo;

public class AlunoAcademiaTest {
    @Test
    public void testImcvaloresPositivos(){
        AlunoAcademia aluno = new AlunoAcademia("João", Sexo.MASCULINO, 80, 1.80, 30);
        double imc = aluno.calculoImc();

        assertEquals(24.69, imc);
    }

    @Test
    public void testImcvaloresNegativosOuZero(){
        AlunoAcademia aluno = new AlunoAcademia("Maria", Sexo.FEMININO, 80, 0, -28);
        
        assertThrows(ArithmeticException.class, () -> {
            aluno.calculoImc();
        });
    }

    @Test
    public void testVipHomemMaisDe40ComImcValido(){
        AlunoAcademia aluno = new AlunoAcademia("José", Sexo.MASCULINO, 85, 1.80, 41);

        assertTrue(aluno.VIP());
    }

    @Test
    public void testVipHomemMenosDe40ComImcValido(){
        AlunoAcademia aluno = new AlunoAcademia("Pedro", Sexo.MASCULINO, 75, 1.80, 30);

        assertTrue(aluno.VIP());
    }

    @Test
    public void testHomemNaoVipPorImcAlto(){
        AlunoAcademia aluno = new AlunoAcademia( "Marcos", Sexo.MASCULINO, 90, 1.70, 35);

        assertFalse(aluno.VIP());
    }

    @Test
    public void testVipMulherMaisDe40ComImcValido(){
        AlunoAcademia aluna = new AlunoAcademia("Priscila", Sexo.FEMININO, 70, 1.70, 45);

        assertTrue(aluna.VIP());
    }

    @Test
    public void testVipMulherMenosDe40ComImcValido(){
        AlunoAcademia aluna = new AlunoAcademia("Rute", Sexo.FEMININO, 60, 1.70, 30);

        assertTrue(aluna.VIP());
    }

    @Test
    public void testMulherNaoVipPorImcAlto(){
        AlunoAcademia aluna = new AlunoAcademia("Ana", Sexo.FEMININO, 75, 1.60, 30);

        assertFalse(aluna.VIP());
    }
}
