package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_109 {
    private final Production47_109 production = new Production47_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}