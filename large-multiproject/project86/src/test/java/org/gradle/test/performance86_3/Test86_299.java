package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_299 {
    private final Production86_299 production = new Production86_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}