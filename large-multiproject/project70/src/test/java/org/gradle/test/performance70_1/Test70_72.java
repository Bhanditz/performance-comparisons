package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_72 {
    private final Production70_72 production = new Production70_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}