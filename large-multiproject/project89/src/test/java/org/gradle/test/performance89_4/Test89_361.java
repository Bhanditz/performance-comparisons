package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_361 {
    private final Production89_361 production = new Production89_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}