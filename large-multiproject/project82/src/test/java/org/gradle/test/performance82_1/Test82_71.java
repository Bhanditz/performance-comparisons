package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_71 {
    private final Production82_71 production = new Production82_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}