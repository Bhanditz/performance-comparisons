package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_307 {
    private final Production86_307 production = new Production86_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}