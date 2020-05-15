package org.example.javatest.util;

//import org.junit.After;

//import static org.junit.Assert.*;

public class StringUtilTest {

//    @After
//    public void tearDown() throws Exception {
//    }

    public static void main(String[] args) {
        String res = StringUtil.repeat("hola", 3);
        System.out.println(res);

        String res1 = StringUtil.repeat("hola", 1);
        System.out.println(res1);
    }
}