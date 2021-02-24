package p4Test;

import filaB.p4.Login;
import filaB.p4.Util;
import filaB.p4.Util2;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class Ej4Test {
    Util utilMock = Mockito.mock(Util.class);
    Util2 util2Mock = Mockito.mock(Util2.class);

    @Test
    public void verify_Login(){
        Mockito.when(utilMock.getPermision("test", "123")).thenReturn("CRUD");
        Mockito.when(util2Mock.isUserValid("test", "123")).thenReturn(true);
        Mockito.verify(utilMock).getPermision("test", "123");

        Login login = new Login(utilMock, util2Mock);
        Assert.assertEquals("ERROR: ", "PERMISSION ROLE CRUD", login.roleUser("test", "123"));
    }
}
