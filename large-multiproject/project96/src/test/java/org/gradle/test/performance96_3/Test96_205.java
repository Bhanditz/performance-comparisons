package org.gradle.test.performance96_3;

import static org.junit.Assert.*;

public class Test96_205 {
    private final Production96_205 production = new Production96_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}