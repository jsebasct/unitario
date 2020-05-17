package org.example.javatest.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeatOnce() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void testRepeatMultiple() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void testRepeatZero() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRepeatNegativeTimes() {
        Assert.assertEquals("", StringUtil.repeat("hola", -1));
    }
}