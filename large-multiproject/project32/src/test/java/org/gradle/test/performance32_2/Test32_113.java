package org.gradle.test.performance32_2;

import static org.junit.Assert.*;

public class Test32_113 {
    private final Production32_113 production = new Production32_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}