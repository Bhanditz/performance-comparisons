package org.gradle.test.performance61_3;

import static org.junit.Assert.*;

public class Test61_263 {
    private final Production61_263 production = new Production61_263("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}