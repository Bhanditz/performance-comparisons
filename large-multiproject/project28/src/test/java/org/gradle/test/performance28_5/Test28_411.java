package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_411 {
    private final Production28_411 production = new Production28_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}