package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_444 {
    private final Production82_444 production = new Production82_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}