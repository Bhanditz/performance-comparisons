package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_306 {
    private final Production60_306 production = new Production60_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}