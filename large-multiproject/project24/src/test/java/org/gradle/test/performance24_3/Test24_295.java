package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_295 {
    private final Production24_295 production = new Production24_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}