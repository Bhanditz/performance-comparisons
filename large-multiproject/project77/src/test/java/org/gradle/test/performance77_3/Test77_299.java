package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_299 {
    private final Production77_299 production = new Production77_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}