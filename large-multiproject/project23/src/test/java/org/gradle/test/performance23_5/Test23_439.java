package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_439 {
    private final Production23_439 production = new Production23_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}