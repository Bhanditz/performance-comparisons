package org.gradle.test.performance21_2;

import static org.junit.Assert.*;

public class Test21_180 {
    private final Production21_180 production = new Production21_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}