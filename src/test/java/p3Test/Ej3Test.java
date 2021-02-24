package p3Test;

import filaB.p3.Ej3Utils;
import org.junit.Assert;
import org.junit.Test;
import org.powermock.utils.Asserts;

public class Ej3Test {

    @Test(expected = Exception.class)
    public void test1() throws Exception {
        Ej3Utils ej3 = new Ej3Utils();
        Assert.assertEquals("ERROR: ", "ci no puede ser vacia", ej3.isCorrectCI(""));
    }

    @Test(expected = Exception.class)
    public void test2() throws Exception {
        Ej3Utils ej3 = new Ej3Utils();
        Assert.assertEquals("ERROR: ", "ci no puede ser 0", ej3.isCorrectCI("0"));
    }

    @Test(timeout = 1600)
    public void test3() throws Exception {
        Ej3Utils ej3 = new Ej3Utils();
        Assert.assertEquals("ERROR: ", true, ej3.isCorrectCI("35235"));
    }
}
