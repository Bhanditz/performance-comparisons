package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_349 {
    private final Production46_349 production = new Production46_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}