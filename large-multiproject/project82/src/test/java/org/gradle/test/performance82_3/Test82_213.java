package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_213 {
    private final Production82_213 production = new Production82_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}