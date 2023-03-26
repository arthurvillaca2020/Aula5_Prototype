import org.example.Bolo;
import org.example.Receita;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoloTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Bolo bolo = new Bolo( "Receita Vovó Cuca", new Receita(4, 1, 3));

        Bolo boloClone = bolo.clone();
        boloClone.setNomeDaReceita("Receita Vovó Clonada");
        boloClone.getReceita().setOvos(3);

        assertEquals("Bolo { Nome da receita = 'Receita Vovó Cuca', Receita { Numero de Ovos = 4, Caixa de leite = 1, Colher de farinha = 3}}", bolo.toString());
        assertEquals("Bolo { Nome da receita = 'Receita Vovó Clonada', Receita { Numero de Ovos = 3, Caixa de leite = 1, Colher de farinha = 3}}", boloClone.toString());
    }
}
