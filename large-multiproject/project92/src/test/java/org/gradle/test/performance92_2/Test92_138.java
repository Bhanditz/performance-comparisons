package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_138 {
    private final Production92_138 production = new Production92_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}