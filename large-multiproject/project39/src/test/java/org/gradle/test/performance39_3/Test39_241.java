package org.gradle.test.performance39_3;

import static org.junit.Assert.*;

public class Test39_241 {
    private final Production39_241 production = new Production39_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}