package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_427 {
    private final Production70_427 production = new Production70_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}