package org.gradle.test.performance55_1;

import static org.junit.Assert.*;

public class Test55_28 {
    private final Production55_28 production = new Production55_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}