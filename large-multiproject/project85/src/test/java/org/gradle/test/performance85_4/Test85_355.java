package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_355 {
    private final Production85_355 production = new Production85_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}