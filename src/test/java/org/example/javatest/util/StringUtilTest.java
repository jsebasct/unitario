package org.example.javatest.util;

//import org.junit.After;

//import static org.junit.Assert.*;

public class StringUtilTest {

//    @After
//    public void tearDown() throws Exception {
//    }

    public static void main(String[] args) {
        String res = StringUtil.repeat("hola", 3);
        assertEquals(res, "holaholahola");


        String res1 = StringUtil.repeat("hola", 1);
        if (!res1.equals("hola")) {
            throw new RuntimeException("error");
        }
    }

    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " no es igual a lo esperado: " + expected);
        }
    }
}