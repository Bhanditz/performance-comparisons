package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_196 {
    private final Production14_196 production = new Production14_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}