package org.gradle.test.performance67_3;

import static org.junit.Assert.*;

public class Test67_288 {
    private final Production67_288 production = new Production67_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}