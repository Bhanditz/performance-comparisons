package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_5 {
    private final Production96_5 production = new Production96_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}