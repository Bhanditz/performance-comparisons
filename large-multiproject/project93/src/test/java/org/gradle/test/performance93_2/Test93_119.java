package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_119 {
    private final Production93_119 production = new Production93_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}