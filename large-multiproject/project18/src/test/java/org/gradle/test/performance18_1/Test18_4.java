package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_4 {
    private final Production18_4 production = new Production18_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}