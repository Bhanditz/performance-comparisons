package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_472 {
    private final Production15_472 production = new Production15_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}