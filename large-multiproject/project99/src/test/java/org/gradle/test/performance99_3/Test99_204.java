package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_204 {
    private final Production99_204 production = new Production99_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}