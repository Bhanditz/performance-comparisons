package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_68 {
    private final Production89_68 production = new Production89_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}