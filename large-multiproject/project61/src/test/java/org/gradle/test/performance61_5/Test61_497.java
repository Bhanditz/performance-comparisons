package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_497 {
    private final Production61_497 production = new Production61_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}