package org.gradle.test.performance41_3;

import static org.junit.Assert.*;

public class Test41_270 {
    private final Production41_270 production = new Production41_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}