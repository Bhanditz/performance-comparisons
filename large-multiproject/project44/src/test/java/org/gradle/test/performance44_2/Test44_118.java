package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_118 {
    private final Production44_118 production = new Production44_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}