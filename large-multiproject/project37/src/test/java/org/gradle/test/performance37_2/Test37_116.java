package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_116 {
    private final Production37_116 production = new Production37_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}