package org.gradle.test.performance96_2;

import static org.junit.Assert.*;

public class Test96_163 {
    private final Production96_163 production = new Production96_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}