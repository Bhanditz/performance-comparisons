package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_62 {
    private final Production10_62 production = new Production10_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}