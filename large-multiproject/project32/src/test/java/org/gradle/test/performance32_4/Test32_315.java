package org.gradle.test.performance32_4;

import static org.junit.Assert.*;

public class Test32_315 {
    private final Production32_315 production = new Production32_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}