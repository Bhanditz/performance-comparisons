package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_471 {
    private final Production93_471 production = new Production93_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}