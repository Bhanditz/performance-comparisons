package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_462 {
    private final Production74_462 production = new Production74_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}