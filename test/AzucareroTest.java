import model.Azucarero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AzucareroTest {

    @Test
    public void deberiaDevolverVerdaderoSiHaySuficienteAzucarEnElAzucarero(){
        Azucarero azucarero = new Azucarero(10);
        boolean resultado = azucarero.hasAzucar(5);

        assertEquals(true, resultado);
    }

    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzucarero(){
        Azucarero azucarero = new Azucarero(10);
        boolean resultado = azucarero.hasAzucar(13);

        assertEquals(false, resultado);
    }

    @Test
    public void deberiaRestarAzucarAlAzucarero(){
        Azucarero azucarero = new Azucarero(10);
        int resultado = azucarero.giveAzucar(8);

        assertEquals(2, resultado);
    }

}