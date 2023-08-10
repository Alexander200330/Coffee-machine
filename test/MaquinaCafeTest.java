import model.MaquinaCafe;
import model.Vaso;
import model.Cafetera;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaquinaCafeTest {

    @Test
    public void deberiaDevolverUnVasoPequeño(){

//        Cafetera cafetera = new Cafetera(50);
        MaquinaCafe maquinaCafe = new MaquinaCafe();
//        maquinaCafe.setCafetera(cafetera);

        Vaso vaso = maquinaCafe.getTipoVaso("pequeño");

        assertEquals(maquinaCafe.getVasosPequeños(), vaso);

    }

    @Test
    public void deberiaDevolverUnVasoMediano(){

//        Cafetera cafetera = new Cafetera(50);
        MaquinaCafe maquinaCafe = new MaquinaCafe();
//        maquinaCafe.setCafetera(cafetera);

        Vaso vaso = maquinaCafe.getTipoVaso("mediano");

        assertEquals(maquinaCafe.getVasosMedianos(), vaso);

    }

    @Test
    public void deberiaDevolverUnVasoGrande(){

        MaquinaCafe maquinaCafe = new MaquinaCafe();

        Vaso vaso = maquinaCafe.getTipoVaso("grande");

        assertEquals(maquinaCafe.getVasosGrandes(), vaso);

    }

    @Test
    public void deberiaDevolverNoHayVasos(){

        MaquinaCafe maquinaCafe = new MaquinaCafe();

        String resultado = maquinaCafe.checkVaso("pequeño", 13);

        assertEquals("insuficiente", resultado );

    }

    @Test
    public void deberiaDevolverNoHayAzucar(){

        MaquinaCafe maquinaCafe = new MaquinaCafe();

        String resultado = maquinaCafe.checkSugar("pequeño", 51);

        assertEquals("No hay Azúcar", resultado );

    }

    @Test
    public void deberiaRestarVaso(){

        MaquinaCafe maquinaCafe = new MaquinaCafe();
        Vaso vasoPequeño = maquinaCafe.getTipoVaso("pequeño");

        maquinaCafe.getVasoCafe(vasoPequeño, 1, 51);

        int resultado = maquinaCafe.getVasosPequeños().getCantidadVasos();

        assertEquals(9, resultado );

    }

    @Test
    public void deberiaRestarCafe(){

        MaquinaCafe maquinaCafe = new MaquinaCafe();
        Vaso vasoPequeño = maquinaCafe.getTipoVaso("pequeño");

        maquinaCafe.getVasoCafe(vasoPequeño, 1, 51);

        int resultado = maquinaCafe.getCafetera().getCantidadCafe();

        assertEquals(100, resultado );

    }

    @Test
    public void deberiaRestarAzucar(){

        MaquinaCafe maquinaCafe = new MaquinaCafe();
        Vaso vasoPequeño = maquinaCafe.getTipoVaso("pequeño");

        maquinaCafe.getVasoCafe(vasoPequeño, 1, 10);

        int resultado = maquinaCafe.getAzucar().getCantidadAzucar();

        assertEquals(40, resultado );

    }
}