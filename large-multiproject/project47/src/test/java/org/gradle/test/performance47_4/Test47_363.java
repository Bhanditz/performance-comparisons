package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_363 {
    private final Production47_363 production = new Production47_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}