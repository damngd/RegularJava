



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
    
    @Test
    public void IP(){


        assertTrue(regular.ip_Check("127.1.1.255"));
        assertTrue(regular.ip_Check("0.0.0.0"));
        assertTrue(regular.ip_Check("255.255.255.255"));
        assertTrue(regular.ip_Check("128.0.0.123"));
        assertTrue(regular.ip_Check("12.13.14.15"));
        assertTrue(regular.ip_Check("23.0.3.0"));

        assertFalse(regular.ip_Check("..."));
        assertFalse(regular.ip_Check("123.256.0.255"));
        assertFalse(regular.ip_Check("300.1.1.255"));
        assertFalse(regular.ip_Check("127.1.10003.255"));
        assertFalse(regular.ip_Check("127.1.1.2532"));
        assertFalse(regular.ip_Check("1290.12.12.255"));
    }

    @Test
    public void url(){
        assertTrue(regular.URL("http://www.example.com:80/path/to/myfile.html?key1=value1&key2=value2#SomewhereInTheDocument"));
        assertTrue(regular.URL("http://www.example.com"));
        assertTrue(regular.URL("http://example.com"));
        assertTrue(regular.URL("http://example.com:8080"));
        assertTrue(regular.URL("http://example.com"));
        assertTrue(regular.URL("https://developer.mozilla.org/ru/search.jpg?q=URL"));

        assertFalse(regular.URL("Just text"));
        assertFalse(regular.URL("http://a.com"));
        assertFalse(regular.URL("http://aads-.com"));
        assertFalse(regular.URL("http://-asda.com"));
        assertFalse(regular.URL("http://asd_sdas.com"));
        assertFalse(regular.URL("http://adsa dsa.com"));
    }
    @Test
    public void password(){
        assertTrue(regular.Password("C00l_Pass"));
        assertTrue(regular.Password("Jxtymckjyj66"));
        assertTrue(regular.Password("Gfhjkm1337very"));
        assertTrue(regular.Password("rhenjqxtk77A"));
        assertTrue(regular.Password("Xtk_Ns099_a"));
        assertTrue(regular.Password("YthtfkmyjJxtymCkjyj963"));

        assertFalse(regular.Password("C00l_ps"));
        assertFalse(regular.Password("C00L_PASS"));
        assertFalse(regular.Password("ghfhf4567434789"));
        assertFalse(regular.Password("VeryEasy"));
        assertFalse(regular.Password("C00L_PASS876548"));
        assertFalse(regular.Password("chelti..'!!!!!"));
    }


}
