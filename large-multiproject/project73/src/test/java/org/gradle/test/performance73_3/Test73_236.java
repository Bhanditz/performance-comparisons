package org.gradle.test.performance73_3;

import static org.junit.Assert.*;

public class Test73_236 {
    private final Production73_236 production = new Production73_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}