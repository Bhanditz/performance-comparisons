package org.gradle.test.performance27_3;

import static org.junit.Assert.*;

public class Test27_274 {
    private final Production27_274 production = new Production27_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}