package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_333 {
    private final Production99_333 production = new Production99_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}