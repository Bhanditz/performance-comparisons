package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_426 {
    private final Production56_426 production = new Production56_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}