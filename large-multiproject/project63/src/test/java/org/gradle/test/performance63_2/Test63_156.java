package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_156 {
    private final Production63_156 production = new Production63_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}