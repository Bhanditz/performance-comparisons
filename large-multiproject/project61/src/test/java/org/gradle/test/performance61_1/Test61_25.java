package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_25 {
    private final Production61_25 production = new Production61_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}