package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_55 {
    private final Production32_55 production = new Production32_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}