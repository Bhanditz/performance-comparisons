package org.gradle.test.performance28_2;

import static org.junit.Assert.*;

public class Test28_200 {
    private final Production28_200 production = new Production28_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}