package org.gradle.test.performance33_2;

import static org.junit.Assert.*;

public class Test33_108 {
    private final Production33_108 production = new Production33_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}