package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_147 {
    private final Production93_147 production = new Production93_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}