package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_59 {
    private final Production37_59 production = new Production37_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}