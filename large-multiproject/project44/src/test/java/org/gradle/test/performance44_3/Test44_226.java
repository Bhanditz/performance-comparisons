package org.gradle.test.performance44_3;

import static org.junit.Assert.*;

public class Test44_226 {
    private final Production44_226 production = new Production44_226("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}