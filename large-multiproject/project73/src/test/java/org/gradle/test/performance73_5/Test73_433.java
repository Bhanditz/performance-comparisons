package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_433 {
    private final Production73_433 production = new Production73_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}