package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_222 {
    private final Production37_222 production = new Production37_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}