package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_66 {
    private final Production39_66 production = new Production39_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}