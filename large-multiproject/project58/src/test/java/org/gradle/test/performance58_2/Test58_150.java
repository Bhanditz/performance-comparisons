package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_150 {
    private final Production58_150 production = new Production58_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}