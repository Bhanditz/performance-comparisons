package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_278 {
    private final Production70_278 production = new Production70_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}