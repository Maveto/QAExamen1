package testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import p1Test.Ej1Test;
import p2Test.Ej2Test;
import p3Test.Ej3Test;
import p4Test.Ej4Test;
import p5Test.Ej5Test;

@RunWith(value = Suite.class)
@Suite.SuiteClasses({
        Ej1Test.class,
        Ej2Test.class,
        Ej3Test.class,
        Ej4Test.class,
        Ej5Test.class
})
public class TestSuite {

}
