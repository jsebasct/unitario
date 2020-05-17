package org.example.javatest.util;

import org.junit.Assert;

public class StringUtilTest {

    public static void main(String[] args) {

        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));

        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

//    private static void assertEquals(String actual, String expected) {
//        if (!actual.equals(expected)) {
//            throw new RuntimeException(actual + " no es igual a lo esperado: " + expected);
//        }
//    }
}