package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_349 {
    private final Production45_349 production = new Production45_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}