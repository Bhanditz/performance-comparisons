package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_158 {
    private final Production24_158 production = new Production24_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}