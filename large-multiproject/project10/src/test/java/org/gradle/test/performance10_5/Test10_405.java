package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_405 {
    private final Production10_405 production = new Production10_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}