package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_335 {
    private final Production15_335 production = new Production15_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}