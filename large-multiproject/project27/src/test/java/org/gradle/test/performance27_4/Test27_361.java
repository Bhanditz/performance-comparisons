package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_361 {
    private final Production27_361 production = new Production27_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}