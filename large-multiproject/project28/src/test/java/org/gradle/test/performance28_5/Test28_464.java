package org.gradle.test.performance28_5;

import static org.junit.Assert.*;

public class Test28_464 {
    private final Production28_464 production = new Production28_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}