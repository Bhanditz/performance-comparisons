package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_286 {
    private final Production92_286 production = new Production92_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}