package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_192 {
    private final Production81_192 production = new Production81_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}