import model.Cafetera;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeteraTest {

    @Test
    public void deberiaDevolverVerdaderoSiExisteCafe() {
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(4);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoSiNoHayCafe() {
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(13);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarCafeALaCafetera() {
        Cafetera cafetera = new Cafetera(10);

        int resultado = cafetera.giveCafe(8);

        assertEquals(2, resultado);
    }

}