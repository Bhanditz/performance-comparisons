package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_287 {
    private final Production70_287 production = new Production70_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}