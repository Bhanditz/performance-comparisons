package org.gradle.test.performance32_3;

import static org.junit.Assert.*;

public class Test32_293 {
    private final Production32_293 production = new Production32_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}