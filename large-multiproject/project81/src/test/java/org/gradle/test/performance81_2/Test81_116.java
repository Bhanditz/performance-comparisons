package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_116 {
    private final Production81_116 production = new Production81_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}