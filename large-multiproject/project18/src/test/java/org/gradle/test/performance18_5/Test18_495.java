package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_495 {
    private final Production18_495 production = new Production18_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}