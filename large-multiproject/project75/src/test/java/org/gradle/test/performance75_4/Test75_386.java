package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_386 {
    private final Production75_386 production = new Production75_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}