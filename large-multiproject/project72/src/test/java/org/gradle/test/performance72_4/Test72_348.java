package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_348 {
    private final Production72_348 production = new Production72_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}