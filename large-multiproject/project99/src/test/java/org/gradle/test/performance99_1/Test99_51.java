package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_51 {
    private final Production99_51 production = new Production99_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}