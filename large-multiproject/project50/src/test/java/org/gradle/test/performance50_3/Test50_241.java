package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_241 {
    private final Production50_241 production = new Production50_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}