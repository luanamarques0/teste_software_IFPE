import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.atividade7.classes.Gestao;
import com.atividade7.classes.Pedidos;
import com.atividade7.classes.Produto;

public class GestaoTest {
    @Test
    public void testValorTotalVendas() {
        Produto prod1 = new Produto("café", 17.50);
        Produto prod2 = new Produto("Arroz", 8.20);
        Pedidos pedidos = new Pedidos();
        pedidos.adicionarProduto(prod2);
        pedidos.adicionarProduto(prod1);

        Gestao gestao = new Gestao(pedidos);
        assertEquals(25.7, gestao.valorTotalVendas(), 0.01);
    }

    @Test
    public void testAdicionarMesmoproduto() {
        Produto prod1 = new Produto("café", 17.50);
        Pedidos pedidos = new Pedidos();

        pedidos.adicionarProduto(prod1);
        pedidos.adicionarProduto(prod1);
        pedidos.adicionarProduto(prod1);
        pedidos.adicionarProduto(prod1);

        assertEquals(4, pedidos.quantidadeProdutos());
    }

    @Test
    public void testValorTotalVendasPedidoVazios() {
        Gestao gestao = new Gestao();
        assertThrows(NullPointerException.class, () -> {
            gestao.valorTotalVendas();
        });
    }

    @Test
    public void testValorTotalVendasPrecoNegativo() {
        Produto prodValido = new Produto("Arroz", 8.20);
        Produto prodInvalido = new Produto("Café", -5.0);

        Pedidos pedidos = new Pedidos();
        pedidos.adicionarProduto(prodValido);

        assertThrows(IllegalArgumentException.class, () -> {
            pedidos.adicionarProduto(prodInvalido);
        });
    }
}
