package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_292 {
    private final Production49_292 production = new Production49_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}