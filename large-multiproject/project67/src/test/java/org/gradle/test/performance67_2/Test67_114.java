package org.gradle.test.performance67_2;

import static org.junit.Assert.*;

public class Test67_114 {
    private final Production67_114 production = new Production67_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}