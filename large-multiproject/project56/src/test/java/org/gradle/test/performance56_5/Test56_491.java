package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_491 {
    private final Production56_491 production = new Production56_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}