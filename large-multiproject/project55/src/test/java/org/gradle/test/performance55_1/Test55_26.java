package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_26 {
    private final Production55_26 production = new Production55_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}