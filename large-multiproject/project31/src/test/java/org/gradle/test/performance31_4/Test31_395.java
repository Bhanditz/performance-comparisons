package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_395 {
    private final Production31_395 production = new Production31_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}