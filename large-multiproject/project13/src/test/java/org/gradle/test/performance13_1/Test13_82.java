package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_82 {
    private final Production13_82 production = new Production13_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}