package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_31 {
    private final Production58_31 production = new Production58_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}