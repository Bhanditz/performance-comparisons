package org.gradle.test.performance44_1;

import static org.junit.Assert.*;

public class Test44_12 {
    private final Production44_12 production = new Production44_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}