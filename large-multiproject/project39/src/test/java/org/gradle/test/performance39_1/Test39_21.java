package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_21 {
    private final Production39_21 production = new Production39_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}