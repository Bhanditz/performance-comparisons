package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_473 {
    private final Production46_473 production = new Production46_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}