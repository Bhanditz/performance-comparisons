package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_91 {
    private final Production89_91 production = new Production89_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}