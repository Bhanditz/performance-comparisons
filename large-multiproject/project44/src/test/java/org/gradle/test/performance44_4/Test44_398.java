package org.gradle.test.performance44_4;

import static org.junit.Assert.*;

public class Test44_398 {
    private final Production44_398 production = new Production44_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}