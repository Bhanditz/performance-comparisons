package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_55 {
    private final Production94_55 production = new Production94_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}