package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_284 {
    private final Production82_284 production = new Production82_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}