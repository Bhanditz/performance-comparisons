package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_499 {
    private final Production83_499 production = new Production83_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}