import org.junit.jupiter.api.Test;

import com.ifpe.teste.triangulo.classes.Triangulo;
import com.ifpe.teste.triangulo.enums.TipoTriangulo;

import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {
    
    @Test
    public void testEscalenoValido(){
        Triangulo escaleno = new Triangulo(3, 4, 5);

        assertEquals(TipoTriangulo.ESCALENO, escaleno.classificacaoTriangulos());
    }

    @Test
    public void testIsoscelesValido(){
        Triangulo isosceles = new Triangulo(8,6,8);

        assertEquals(TipoTriangulo.ISOSCELES, isosceles.classificacaoTriangulos());
    }

    @Test
    public void testEquilateroValido(){
        Triangulo equilatero = new Triangulo(8.0,8.0,8.0);

        assertEquals(TipoTriangulo.EQUILATERO, equilatero.classificacaoTriangulos());
    }

    @Test
    public void testUmLadoZero(){
        Triangulo triangulo = new Triangulo(3,0,4);

        assertEquals(TipoTriangulo.INVALIDO, triangulo.classificacaoTriangulos());
    }

    @Test
    public void testUmLadoNegativo(){
        Triangulo triangulo = new Triangulo(3,-1,4);        

        assertEquals(TipoTriangulo.INVALIDO, triangulo.classificacaoTriangulos());
    }

    @Test
    public void testSomaDoisLadosIgualTerceiro() {

        Triangulo triangulo = new Triangulo(2, 3, 5);
        assertEquals(TipoTriangulo.INVALIDO, triangulo.classificacaoTriangulos());
    }
}
