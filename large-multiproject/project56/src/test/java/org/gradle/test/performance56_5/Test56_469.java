package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_469 {
    private final Production56_469 production = new Production56_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}