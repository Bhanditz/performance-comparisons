package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_184 {
    private final Production30_184 production = new Production30_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}