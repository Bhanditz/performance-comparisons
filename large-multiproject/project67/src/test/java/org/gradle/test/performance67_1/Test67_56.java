package org.gradle.test.performance67_1;

import static org.junit.Assert.*;

public class Test67_56 {
    private final Production67_56 production = new Production67_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}