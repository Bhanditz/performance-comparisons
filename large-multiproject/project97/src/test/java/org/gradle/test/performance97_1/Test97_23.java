package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_23 {
    private final Production97_23 production = new Production97_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}