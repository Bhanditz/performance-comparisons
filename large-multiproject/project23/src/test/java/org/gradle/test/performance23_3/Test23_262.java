package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_262 {
    private final Production23_262 production = new Production23_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}