package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_256 {
    private final Production29_256 production = new Production29_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}