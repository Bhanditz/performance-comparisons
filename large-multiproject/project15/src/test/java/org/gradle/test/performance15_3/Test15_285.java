package org.gradle.test.performance15_3;

import static org.junit.Assert.*;

public class Test15_285 {
    private final Production15_285 production = new Production15_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}