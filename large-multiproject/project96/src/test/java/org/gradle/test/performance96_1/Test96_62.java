package org.gradle.test.performance96_1;

import static org.junit.Assert.*;

public class Test96_62 {
    private final Production96_62 production = new Production96_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}