package org.gradle.test.performance91_1;

import static org.junit.Assert.*;

public class Test91_24 {
    private final Production91_24 production = new Production91_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}