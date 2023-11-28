import org.example.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProdutoTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Produto produto = new Produto();
        produto.setPreco(20);
        produto.setPcJuros(0.2);
        assertEquals(24.0, produto.calcularPrecoTotalComJuros());
    }
}
