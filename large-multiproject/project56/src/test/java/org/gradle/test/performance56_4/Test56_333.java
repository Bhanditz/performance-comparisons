package org.gradle.test.performance56_4;

import static org.junit.Assert.*;

public class Test56_333 {
    private final Production56_333 production = new Production56_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}