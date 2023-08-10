import model.Vaso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VasoTest {

    @Test
    public void deberiaDevolverVerdaderoSiExistenVasos(){
        Vaso vasosPequeños = new Vaso(2, 10);

        boolean resultado = vasosPequeños.hasVasos(2);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoSiNoExisten() {
        Vaso vasosPequeños = new Vaso(1, 10);

        boolean resultado = vasosPequeños.hasVasos(2);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarCantidadVasos() {
        Vaso vasosPequeños = new Vaso(5, 10);

        int resultado = vasosPequeños.giveVasos(3);

        assertEquals(2, resultado);
    }

}