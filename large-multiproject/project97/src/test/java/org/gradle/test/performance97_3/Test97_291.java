package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_291 {
    private final Production97_291 production = new Production97_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}