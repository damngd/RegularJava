
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularTest {
    private Regular regular;
    @Before
    public void init() {regular = new Regular();}

    @Test
    public void guid(){

        assertTrue(regular.GUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        assertTrue(regular.GUID("e02fABCD-00f1-0903-7830-0d00a0038bA0"));
        assertTrue(regular.GUID("F23d0e41-f04d-BcBA-ca30-0d00a0038ba0"));
        assertTrue(regular.GUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        assertTrue(regular.GUID("e02fd0e4-00fd-090A-abcd-0d00a0038ba0"));
        assertTrue(regular.GUID("e02fd0e4-120f-090A-ca30-0d00a0038ba0"));

        assertFalse(regular.GUID("----"));
        assertFalse(regular.GUID("TT2fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        assertFalse(regular.GUID("e02fd0e41-00fd-090A-ca30-0d00a0038ba0"));
        assertFalse(regular.GUID("e02fd0e4-020fd-090A-ca30-0d00a0038ba0"));
        assertFalse(regular.GUID("e02fd0e4-00fd-0930A-ca30-0d00a0038ba0"));
        assertFalse(regular.GUID("e02fd0e4-00fd-090A-ca430-0d00a02038ba0"));

    }


}
