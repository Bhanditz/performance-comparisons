package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_490 {
    private final Production14_490 production = new Production14_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}