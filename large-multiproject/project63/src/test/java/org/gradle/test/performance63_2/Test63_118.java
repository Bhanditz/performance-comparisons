package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_118 {
    private final Production63_118 production = new Production63_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}