package org.gradle.test.performance55_2;

import static org.junit.Assert.*;

public class Test55_116 {
    private final Production55_116 production = new Production55_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}