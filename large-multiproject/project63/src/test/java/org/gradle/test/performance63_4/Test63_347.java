package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_347 {
    private final Production63_347 production = new Production63_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}