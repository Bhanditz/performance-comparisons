package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_357 {
    private final Production72_357 production = new Production72_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}