package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_470 {
    private final Production37_470 production = new Production37_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}