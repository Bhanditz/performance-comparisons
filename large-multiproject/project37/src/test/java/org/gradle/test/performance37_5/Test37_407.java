package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_407 {
    private final Production37_407 production = new Production37_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}