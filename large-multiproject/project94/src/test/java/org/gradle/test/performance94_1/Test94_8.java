package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_8 {
    private final Production94_8 production = new Production94_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}