import org.junit.jupiter.api.Test;

import com.testeunitario.classes.Aluno;
import com.testeunitario.classes.Disciplina;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest{

    //Teste fumaça -> Verifica se o ambiente de teste está funcionando.
    // @Test
    // public void testeSimples() {
    //     int resultado = 2 + 2;
    //     assertEquals(4, resultado);
    // }

    @Test
    public void testAdicionarFaltas(){
        Aluno aluno = new Aluno();

        int faltasIniciais = 2;
        int faltasAdicionadas = 3;
        int faltasEsperadas = faltasIniciais + faltasAdicionadas;

        aluno.setFaltas(faltasIniciais);
        aluno.adicionarFaltas(faltasAdicionadas);

        assertEquals(faltasEsperadas, aluno.getFaltas());
    }

    @Test
    public void testAdicionarDisciplina(){
        Aluno aluno = new Aluno();
        Disciplina disciplinaNova = new Disciplina("Teste de Software", 3);

        aluno.adicionarDisciplina(disciplinaNova);

        assertEquals(1, aluno.verificarQuantidadeDisciplinas());
        assertTrue(aluno.getListaDisciplina().contains(disciplinaNova));
    }

    @Test
    public void testQtdCreditosDisciplinas(){
        Aluno aluno = new Aluno();
        Disciplina disciplinaTeste = new Disciplina("Teste de Software", 3);
        Disciplina disciplinaEngenharia = new Disciplina("Engenharia de software", 2);

        aluno.adicionarDisciplina(disciplinaTeste);
        aluno.adicionarDisciplina(disciplinaEngenharia);

        assertEquals(5.0, aluno.qtdCreditosDisciplinas());

    }
}
 