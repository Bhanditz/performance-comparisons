package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_135 {
    private final Production61_135 production = new Production61_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}