package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_474 {
    private final Production47_474 production = new Production47_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}