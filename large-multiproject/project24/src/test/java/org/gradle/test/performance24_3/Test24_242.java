package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_242 {
    private final Production24_242 production = new Production24_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}