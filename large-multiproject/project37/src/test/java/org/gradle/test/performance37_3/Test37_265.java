package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_265 {
    private final Production37_265 production = new Production37_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}