package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_401 {
    private final Production56_401 production = new Production56_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}