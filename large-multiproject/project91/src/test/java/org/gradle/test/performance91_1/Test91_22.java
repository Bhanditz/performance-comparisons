package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_22 {
    private final Production91_22 production = new Production91_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}