package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_380 {
    private final Production93_380 production = new Production93_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}