package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_391 {
    private final Production32_391 production = new Production32_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}