package org.gradle.test.performance21_1;

import static org.junit.Assert.*;

public class Test21_47 {
    private final Production21_47 production = new Production21_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}