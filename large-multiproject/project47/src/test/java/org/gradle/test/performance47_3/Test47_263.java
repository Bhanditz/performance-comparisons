package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_263 {
    private final Production47_263 production = new Production47_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}