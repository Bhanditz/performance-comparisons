package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_411 {
    private final Production27_411 production = new Production27_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}