package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_90 {
    private final Production98_90 production = new Production98_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}