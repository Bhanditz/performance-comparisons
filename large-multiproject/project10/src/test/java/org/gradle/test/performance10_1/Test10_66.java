package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_66 {
    private final Production10_66 production = new Production10_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}