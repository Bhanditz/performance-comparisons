package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_165 {
    private final Production86_165 production = new Production86_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}