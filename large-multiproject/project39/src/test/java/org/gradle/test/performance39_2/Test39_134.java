package org.gradle.test.performance39_2;

import static org.junit.Assert.*;

public class Test39_134 {
    private final Production39_134 production = new Production39_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}