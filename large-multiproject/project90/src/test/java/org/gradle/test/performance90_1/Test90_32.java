package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_32 {
    private final Production90_32 production = new Production90_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}