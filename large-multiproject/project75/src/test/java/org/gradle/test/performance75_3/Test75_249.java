package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_249 {
    private final Production75_249 production = new Production75_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}