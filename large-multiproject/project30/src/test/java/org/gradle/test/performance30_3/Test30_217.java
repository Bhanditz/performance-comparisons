package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_217 {
    private final Production30_217 production = new Production30_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}