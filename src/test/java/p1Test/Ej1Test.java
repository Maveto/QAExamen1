package p1Test;

import filaB.p1.Ej1UtilsNumeros;
import org.junit.*;

public class Ej1Test {
    @Before
    public void before(){
        System.out.println("*************** BEFORE");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("*************** BEFORE CLASS");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("*************** AFTER CLASS");
    }

    @After
    public void after(){
        System.out.println("*************** AFTER");
    }

    @Test
    public void test1(){
        Ej1UtilsNumeros ej1 = new Ej1UtilsNumeros();
        Assert.assertTrue("ERROR:", ej1.esPrimo(3));
    }

    @Test
    public void test2(){
        Ej1UtilsNumeros ej1 = new Ej1UtilsNumeros();
        Assert.assertEquals("ERROR: ", false, ej1.esPrimo(6));
    }

    @Test
    public void test3(){
        Ej1UtilsNumeros ej1 = new Ej1UtilsNumeros();
        Assert.assertTrue("ERROR:", ej1.esPrimo(11));
    }
}
