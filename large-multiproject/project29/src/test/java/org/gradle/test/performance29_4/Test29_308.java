package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_308 {
    private final Production29_308 production = new Production29_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}