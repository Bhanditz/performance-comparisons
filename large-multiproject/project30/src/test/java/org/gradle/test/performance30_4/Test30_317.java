package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_317 {
    private final Production30_317 production = new Production30_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}