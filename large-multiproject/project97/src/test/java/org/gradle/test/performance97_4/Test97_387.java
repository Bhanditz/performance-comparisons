package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_387 {
    private final Production97_387 production = new Production97_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}