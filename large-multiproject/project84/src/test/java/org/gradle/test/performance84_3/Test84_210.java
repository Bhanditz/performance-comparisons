package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_210 {
    private final Production84_210 production = new Production84_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}