package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_21 {
    private final Production82_21 production = new Production82_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}