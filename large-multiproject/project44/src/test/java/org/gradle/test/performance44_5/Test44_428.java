package org.gradle.test.performance44_5;

import static org.junit.Assert.*;

public class Test44_428 {
    private final Production44_428 production = new Production44_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}