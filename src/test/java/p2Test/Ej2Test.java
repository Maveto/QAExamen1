package p2Test;

import filaB.p2.Ej2Notas;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value = Parameterized.class)
public class Ej2Test {

    private int nota;
    private String expRes;

    public Ej2Test(int nota, String expRes){
        this.nota = nota;
        this.expRes = expRes;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> objects = new ArrayList<>();

        objects.add(new Object[]{-1, "VALOR INCORRECTO"});
        //Este caso (nota=0) no esta funcionando para el metodo.
        objects.add(new Object[]{0, "F"});
        objects.add(new Object[]{1, "F"});
        objects.add(new Object[]{4, "F"});
        objects.add(new Object[]{5, "F"});
        objects.add(new Object[]{6, "C"});
        objects.add(new Object[]{9, "B"});
        objects.add(new Object[]{10, "A"});
        objects.add(new Object[]{11, "VALOR INCORRECTO"});

        return objects;
    }

    @Test
    public void ej2Test(){
        Ej2Notas ej2 = new Ej2Notas();
        Assert.assertEquals("ERROR: ", this.expRes, ej2.notasCualitativas(this.nota));
    }
}
