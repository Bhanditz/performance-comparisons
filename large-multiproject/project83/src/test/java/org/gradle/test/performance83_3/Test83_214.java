package org.gradle.test.performance83_3;

import static org.junit.Assert.*;

public class Test83_214 {
    private final Production83_214 production = new Production83_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}