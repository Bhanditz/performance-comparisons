package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_421 {
    private final Production63_421 production = new Production63_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}