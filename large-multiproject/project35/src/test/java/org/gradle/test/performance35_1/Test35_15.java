package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_15 {
    private final Production35_15 production = new Production35_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}