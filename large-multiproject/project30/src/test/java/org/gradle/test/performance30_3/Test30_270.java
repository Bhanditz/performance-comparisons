package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_270 {
    private final Production30_270 production = new Production30_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}