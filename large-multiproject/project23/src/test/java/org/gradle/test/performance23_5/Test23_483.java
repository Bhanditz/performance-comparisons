package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_483 {
    private final Production23_483 production = new Production23_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}