package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_59 {
    private final Production99_59 production = new Production99_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}