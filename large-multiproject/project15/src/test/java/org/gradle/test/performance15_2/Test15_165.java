package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_165 {
    private final Production15_165 production = new Production15_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}