package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_121 {
    private final Production24_121 production = new Production24_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}