package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_88 {
    private final Production82_88 production = new Production82_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}