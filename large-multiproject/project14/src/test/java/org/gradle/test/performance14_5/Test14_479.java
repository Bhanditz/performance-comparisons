package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_479 {
    private final Production14_479 production = new Production14_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}