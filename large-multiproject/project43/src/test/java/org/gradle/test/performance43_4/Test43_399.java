package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_399 {
    private final Production43_399 production = new Production43_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}