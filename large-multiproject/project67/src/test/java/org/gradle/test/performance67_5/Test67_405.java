package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_405 {
    private final Production67_405 production = new Production67_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}