package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_274 {
    private final Production82_274 production = new Production82_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}