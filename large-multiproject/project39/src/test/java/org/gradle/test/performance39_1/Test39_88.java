package org.gradle.test.performance39_1;

import static org.junit.Assert.*;

public class Test39_88 {
    private final Production39_88 production = new Production39_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}