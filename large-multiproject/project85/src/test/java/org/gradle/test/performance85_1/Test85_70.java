package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_70 {
    private final Production85_70 production = new Production85_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}