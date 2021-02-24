package p5Test;

import filaB.p5.CambioMoneda;
import filaB.p5.Util;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Util.class)
public class Ej5Test {

    @Test
    public void verify_New_Money(){
        PowerMockito.mockStatic(Util.class);

        Mockito.when(Util.obtenerTipoDeCambio("Dolares", "Bolivianos")).thenReturn(7);

        CambioMoneda cambioMoneda = new CambioMoneda();
        Assert.assertEquals("ERROR: ", "La cantidad convertida fue : [700] Bolivianos", cambioMoneda.saveInNewMoney(100, "Dolares", "Bolivianos"));
    }
}
