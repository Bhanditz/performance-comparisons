package org.gradle.test.performance72_3;

import static org.junit.Assert.*;

public class Test72_237 {
    private final Production72_237 production = new Production72_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}