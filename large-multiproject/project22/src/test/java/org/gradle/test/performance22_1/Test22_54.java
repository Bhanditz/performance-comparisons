package org.gradle.test.performance22_1;

import static org.junit.Assert.*;

public class Test22_54 {
    private final Production22_54 production = new Production22_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}