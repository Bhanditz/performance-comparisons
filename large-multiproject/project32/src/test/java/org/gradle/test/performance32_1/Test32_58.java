package org.gradle.test.performance32_1;

import static org.junit.Assert.*;

public class Test32_58 {
    private final Production32_58 production = new Production32_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}