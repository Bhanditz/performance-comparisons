package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_304 {
    private final Production55_304 production = new Production55_304("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}