package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_139 {
    private final Production47_139 production = new Production47_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}