package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_463 {
    private final Production60_463 production = new Production60_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}