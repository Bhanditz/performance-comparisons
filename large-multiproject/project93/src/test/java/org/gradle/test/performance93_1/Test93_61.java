package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_61 {
    private final Production93_61 production = new Production93_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}