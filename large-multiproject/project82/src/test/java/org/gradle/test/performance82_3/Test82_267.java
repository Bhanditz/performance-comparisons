package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_267 {
    private final Production82_267 production = new Production82_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}