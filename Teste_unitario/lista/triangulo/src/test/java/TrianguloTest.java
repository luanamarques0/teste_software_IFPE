import org.junit.jupiter.api.Test;

import com.ifpe.teste.triangulo.classes.Triangulo;
import com.ifpe.teste.triangulo.enums.TipoTriangulo;

import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    public void testEscalenoValido() {
        Triangulo escaleno = new Triangulo(3, 4, 5);

        assertEquals(TipoTriangulo.ESCALENO, escaleno.classificacaoTriangulos());
    }

    @Test
    public void testIsoscelesValido() {
        Triangulo isosceles = new Triangulo(8, 6, 8);

        assertEquals(TipoTriangulo.ISOSCELES, isosceles.classificacaoTriangulos());
    }

    @Test
    public void testEquilateroValido() {
        Triangulo equilatero = new Triangulo(8.0, 8.0, 8.0);

        assertEquals(TipoTriangulo.EQUILATERO, equilatero.classificacaoTriangulos());
    }

    @Test
    public void testUmLadoZero() {
        Triangulo triangulo = new Triangulo(3, 0, 4);

        assertEquals(TipoTriangulo.INVALIDO, triangulo.classificacaoTriangulos());
    }

    @Test
    public void testUmLadoNegativo() {
        Triangulo triangulo = new Triangulo(3, -1, 4);

        assertEquals(TipoTriangulo.INVALIDO, triangulo.classificacaoTriangulos());
    }

    @Test
    public void testSomaDoisLadosIgualTerceiro() {

        Triangulo triangulo = new Triangulo(2, 3, 5);
        assertEquals(TipoTriangulo.INVALIDO, triangulo.classificacaoTriangulos());
    }

    // Exercicio 8
    @Test
    public void testCalcularPerimetro() {
        Triangulo triangulo = new Triangulo(2, 3, 5);
        assertEquals(10.0, triangulo.calcularPerimetro());
    }

    @Test
    public void testCalcularPerimetroDecimais() {
        Triangulo triangulo = new Triangulo(1.5, 7.2, 1.3);
        assertEquals(10.0, triangulo.calcularPerimetro());
    }

    @Test
    public void testCalcularPerimetroLadoZero() {
        Triangulo triangulo = new Triangulo(0, 2, 4);
        assertEquals(6.0, triangulo.calcularPerimetro()); // Não devaria permitir pois não existe
    }

    @Test
    public void testCalcularPerimetroLadoNegativo() {
        Triangulo triangulo = new Triangulo(-1, 2, 4);
        assertEquals(5.0, triangulo.calcularPerimetro()); // Não deveria permitir lado invalido
    }

    @Test
    public void testCalcularPerimetroNumerosGrandes() {
        Triangulo triangulo = new Triangulo(1000000000, 1000000000, 1000000000);
        assertEquals(3000000000.0, triangulo.calcularPerimetro());
    }

}