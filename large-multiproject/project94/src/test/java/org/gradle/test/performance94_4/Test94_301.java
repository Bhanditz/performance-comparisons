package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_301 {
    private final Production94_301 production = new Production94_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}